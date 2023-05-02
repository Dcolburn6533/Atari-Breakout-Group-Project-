/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AtariBreakout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.event.*;

import javax.swing.*;
import javax.swing.JPanel;
public class GamePanel extends JPanel implements KeyListener, ActionListener{
    private boolean play = false;
    Score S = new Score();
    
    public int totalBricks = 21;
    public int row = 3;
    public int col = 7;
    private Timer time;
    private int delay  = 8;
    
    private int playerX = 310;
    public Ball ball = new Ball();
    public Collision c = new Collision();
    
   BrickGenerator Bricks = new BrickGenerator(row,col);
    
    public GamePanel(){
        ball.SetXVelocity(-1);
        ball.SetYVelocity(-2);
        ball.SetXPosition(120);
        ball.SetYPosition(350);
        ball.SetRadius(20);
        addKeyListener(this);
        setFocusable(true);
        setFocusTraversalKeysEnabled(false);

    
        time = new Timer(delay, this);
        time.start();
    }
    
    public void Visuals(Graphics Creator){
        Creator.setColor(Color.black);
        Creator.fillRect(1, 1, 692, 592);
        
        Bricks.draw((Graphics2D)Creator);
        
        
        Creator.setColor(Color.yellow);
        Creator.fillRect(0, 0, 3, 592);
        Creator.fillRect(0, 0, 692, 3);
        Creator.fillRect(691, 0, 3, 592);
        
        Creator.setColor(Color.red);
        Creator.fillRect(playerX, 550, 100, 8);
        
        Creator.setColor(Color.yellow);
        Creator.fillOval(ball.GetXPosition(), ball.GetYPosition(), ball.GetRadius(), ball.GetRadius());
        
        Creator.setColor(Color.green);
        Creator.setFont(new Font("serif", Font.BOLD, 25));
        Creator.drawString(""+S.GetScore(), 590, 30);
        
        if(ball.GetYPosition() > 570){
            play = false;
            ball.SetXVelocity(0);
            ball.SetYVelocity(0);
            Creator.setColor(Color.red);
            Creator.setFont(new Font("serif", Font.BOLD, 30));
            Creator.drawString("Game Over, Final Score: " +  S.GetScore(), 190,300);
            
            
        }
        
        Creator.dispose();
    }

    @Override
    public void keyTyped(KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void keyPressed(KeyEvent e) {
      if(e.getKeyCode() == KeyEvent.VK_D){
          if(playerX >= 600){
              playerX = 600;
          }
          else{
              Right();
          }
      }
      
      if(e.getKeyCode() == KeyEvent.VK_A){
          if(playerX <10){
              playerX = 10;
          }
          else{
              Left();
          }
      }
    }
    
    public void Right(){
        play = true;
        playerX +=20;
    }
    public void Left(){
        play = true;
        playerX -= 20;
    }

@Override
public void paintComponent(Graphics g) {
    super.paintComponent(g);
    Visuals(g);
}

    public void keyReleased(KeyEvent e) {}
    
    


    public void actionPerformed(ActionEvent e) {
       time.start();
       if(play){
           
           if(new Rectangle(ball.GetXPosition(), ball.GetYPosition(),ball.GetRadius(),ball.GetRadius()).intersects(new Rectangle(playerX, 550, 100, 8))){
               ball.FlipYVelocity();
           }
 
           if(c.collide(ball, Bricks)){
               Bricks.setBrickBalue(0, c.collideI(ball, Bricks), c.collideJ(ball, Bricks));
               totalBricks--;
               S.addScore();
               Rectangle rect = new Rectangle(c.collideJ(ball, Bricks) * Bricks.brickWidth + 0, c.collideI(ball, Bricks) *Bricks.brickHeight +50, Bricks.brickWidth, Bricks.brickHeight);
               Rectangle ballRect = new Rectangle(ball.GetXPosition(), ball.GetYPosition(), ball.GetRadius(), ball.GetRadius());
               Rectangle brickRect = rect;
               if(ball.GetXPosition() + 19 <= brickRect.x || ball.GetXPosition() +1 >= brickRect.x + brickRect.width){
                           ball.FlipXVelocity();
                       }
                       else{
                           ball.FlipYVelocity();
                       }
           }
           ball.SetXPosition(); 
           ball.SetYPosition();
           if(ball.GetXPosition() > 670 ){
               ball.FlipXVelocity();
           }
           if(ball.GetYPosition() < 0 ){
               ball.FlipYVelocity();
           }
         if(ball.GetXPosition() < 0 ){
               ball.FlipXVelocity();
           }
        if(totalBricks == 0){
            if(row <5){
                row +=1;
                Bricks = new BrickGenerator(row, col);
                totalBricks = 7 * row;
            }
            ball.Accelerate();
             
             
        } 
       
    }
       repaint();
    }
}
    




