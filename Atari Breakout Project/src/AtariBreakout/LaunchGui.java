/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AtariBreakout;
import java.awt.*;
import javax.swing.*;
import javax.swing.border.Border;
/**
 *
 * @author Dcolb
 */
public class LaunchGui extends JFrame {
    private JToggleButton Play;
    private JToggleButton Exit;
    private JLabel GameName;
    private JLabel Empty;
    public LaunchGui(){
         super("Atari Breakout Code");
        Play = new JToggleButton("Play");
        Exit = new JToggleButton("Exit");
        Play.setSize(200, 200);
        Exit.setSize(200, 200);
        GameName = new JLabel(new ImageIcon("C:\\Users\\Dcolb\\Documents\\NetBeansProjects\\Atari-Breakout-Group-Project-\\Atari Breakout Project\\src\\AtariBreakout\\Atari_Game_1.png"));
       
        
        Empty = new JLabel("");
        
        JPanel panel1 = new JPanel(new GridLayout(3,1));
        
        JPanel panel2 = new JPanel();
        JPanel panel4 = new JPanel();
        JPanel panel3 = new JPanel(new GridLayout(1,3));
        panel2.setSize(600, 200);
        panel3.setSize(600, 100);
        panel4.setSize(600, 100);
         panel2.add(GameName);
         panel3.add(Play);
         panel3.add(Empty);
         panel3.add(Exit);
         panel1.add(panel2);
         panel1.add(panel4);
         panel1.add(panel3);
         this.setBackground(Color.RED);
         this.setBounds(700, 700, 700, 700);
         this.add(panel1);
         this.setForeground(Color.red);
         
         
         JPanel GamePanel = new JPanel(new GridLayout( 10,    1));
         JPanel GamePanel1 = new JPanel(new GridLayout(1,8));
         JPanel GamePanel2 = new JPanel(new GridLayout(1,8));
         JPanel GamePanel3 = new JPanel(new GridLayout(1,8));
         JPanel GamePanel4 = new JPanel(new GridLayout(1,8));
         JPanel GamePanel5 = new JPanel(new GridLayout(1,8));
         JPanel PlayArea = new JPanel();
         GamePanel1.setSize(600, 50);
         GamePanel2.setSize(600, 50);
         GamePanel3.setSize(600, 50);
         GamePanel4.setSize(600, 50);
         GamePanel5.setSize(600, 50);
         PlayArea.setSize(600, 350);
         JLabel Rectangles[] = new JLabel[40];
         Border blackline = BorderFactory.createLineBorder(Color.BLACK);
         for (int i = 0; i<8; i++){
             Rectangles[i] = new JLabel(new ImageIcon("C:\\Users\\Dcolb\\Documents\\NetBeansProjects\\Atari-Breakout-Group-Project-\\Atari Breakout Project\\src\\AtariBreakout\\Red.png"));
             Rectangles[i].setSize(75, 50);
             
             Rectangles[i].setBorder(blackline);
             GamePanel1.add(Rectangles[i]);
         }
         for (int i = 8; i<16; i++){
             Rectangles[i] = new JLabel(new ImageIcon("C:\\Users\\Dcolb\\Documents\\NetBeansProjects\\Atari-Breakout-Group-Project-\\Atari Breakout Project\\src\\AtariBreakout\\Orange.png"));
             Rectangles[i].setSize(75, 50);
             Rectangles[i].setBorder(blackline);
             GamePanel2.add(Rectangles[i]);
         }
         for (int i = 16; i<24; i++){
             Rectangles[i] = new JLabel(new ImageIcon("C:\\Users\\Dcolb\\Documents\\NetBeansProjects\\Atari-Breakout-Group-Project-\\Atari Breakout Project\\src\\AtariBreakout\\Green.png"));
             Rectangles[i].setSize(75, 50);
             Rectangles[i].setBorder(blackline);
             GamePanel3.add(Rectangles[i]);
         }
         for (int i = 24; i<32; i++){
             Rectangles[i] = new JLabel(new ImageIcon("C:\\Users\\Dcolb\\Documents\\NetBeansProjects\\Atari-Breakout-Group-Project-\\Atari Breakout Project\\src\\AtariBreakout\\Blue.png"));
             Rectangles[i].setSize(75, 50);
             Rectangles[i].setBorder(blackline);
             GamePanel4.add(Rectangles[i]);
         }
         for (int i = 32; i<40; i++){
             Rectangles[i] = new JLabel(new ImageIcon("C:\\Users\\Dcolb\\Documents\\NetBeansProjects\\Atari-Breakout-Group-Project-\\Atari Breakout Project\\src\\AtariBreakout\\Purple.png"));
             Rectangles[i].setSize(75, 50);
             Rectangles[i].setBorder(blackline);
             GamePanel5.add(Rectangles[i]);
         }
         GamePanel.add(GamePanel1);
         GamePanel.add(GamePanel2);
         GamePanel.add(GamePanel3);
         GamePanel.add(GamePanel4);
         GamePanel.add(GamePanel5);
         GamePanel.add(PlayArea);
         GamePanel.add(PlayArea);
         GamePanel.add(PlayArea);
         GamePanel.add(PlayArea);
         GamePanel.add(PlayArea);
         this.remove(panel1);
         this.add(GamePanel);
    }
   
    

    
    
}
