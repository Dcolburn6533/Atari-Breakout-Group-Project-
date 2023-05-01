/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AtariBreakout;
import java.awt.*;
import javax.swing.*;
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
         
    }
   
    

    
    
}
