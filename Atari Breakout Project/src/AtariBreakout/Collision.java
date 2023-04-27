/** CMPSCI 221 Final Project
 * Collision.java
 * Purpose: Create a score class for the final project
 * @author Dcolb and @author samfarhady
 */
package AtariBreakout;

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
