/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AtariBreakout;

/**
 *
 * @author Dcolb
 */
public class Collision {
    public boolean collide(Circle c, Rectangle r) {
        if (c.GetYPosition() == r.GetYPos()) {
            if ((c.GetXPosition() >= r.GetXPos() - (r.GetLength()/2)) & (c.GetXPosition() <= r.GetXPos() + (r.GetLength()/2))) {
                return true;
            }
            else {
                return false;
            }
    }
        else {
            return false;
        }
}
    
   
        
     
    
}
