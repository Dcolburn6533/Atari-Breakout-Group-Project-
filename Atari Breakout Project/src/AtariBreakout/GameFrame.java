/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AtariBreakout;
import javax.swing.JFrame;
/**
 *
 * @author Dcolb
 */
public class GameFrame {
    public static void main(){
    JFrame GameWindow = new JFrame();
      GamePanel Atari = new GamePanel();
      Atari.setVisible(true);
    GameWindow.setBounds(10,10,700,600);
    GameWindow.setTitle("Atari Breakout");
    GameWindow.setResizable(false);
    GameWindow.setVisible(true);
    GameWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  
   
    GameWindow.add(Atari);
}
}
