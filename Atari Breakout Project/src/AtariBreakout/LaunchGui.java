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
    public LaunchGui(){
         super("Atari Breakout Code");
        Play = new JToggleButton("Play");
        Exit = new JToggleButton("Exit");
        GameName = new JLabel("Atari Breakout");
        GameName.setFont(new Font("Large", Font.PLAIN, 25));
        
        
        JPanel panel1 = new JPanel(new GridLayout(2,1));
        
        JPanel panel2 = new JPanel();
        JPanel panel3 = new JPanel(new GridLayout(1,2));
         panel2.add(GameName);
         panel3.add(Play);
         panel3.add(Exit);
         panel1.add(panel2);
         panel1.add(panel3);
         this.setBackground(Color.RED);
         this.setBounds(700, 700, 700, 700);
       
    }
   
    

    
    
}
