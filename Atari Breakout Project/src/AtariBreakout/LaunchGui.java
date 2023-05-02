/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AtariBreakout;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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

    public LaunchGui() {

        super("Atari Breakout Code");
        MyActionListener myListener = new MyActionListener();
        setSize(600, 600);
        setLocationRelativeTo(null);
        Play = new JToggleButton("Play");
        Exit = new JToggleButton("Exit");
        Play.setSize(200, 200);
        Exit.setSize(200, 200);
        GameName = new JLabel(new ImageIcon("C:\\Users\\Dcolb\\Documents\\NetBeansProjects\\Atari-Breakout-Group-Project-\\Atari Breakout Project\\src\\AtariBreakout\\Atari_Game_1.png"));

        Empty = new JLabel("");

        JPanel panel1 = new JPanel(new GridLayout(3, 1));

        JPanel panel2 = new JPanel();
        JPanel panel4 = new JPanel();
        JPanel panel3 = new JPanel(new GridLayout(1, 3));
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

        this.add(panel1);
        this.setForeground(Color.red);

        Play.addActionListener(myListener);
        Exit.addActionListener(myListener);
    }

    private class MyActionListener implements ActionListener {

        public void actionPerformed(ActionEvent myEvent) {
            if (myEvent.getSource() == Play) {
                GameFrame Atari  = new GameFrame();
                Atari.main();
                
            }
            else if (myEvent.getSource() == Exit){
              Runtime.getRuntime().exit(4);
    
            }
        }
    }
}

          
              
       
    

    
    

