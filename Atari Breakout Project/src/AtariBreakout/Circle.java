/** CMPSCI 221 Final Project
 * Circle.java
 * Purpose: Create a circle class for the final project
 * @author samfarhady
 */
package AtariBreakout;

public class Circle {
    private int x, y, vx, vy, radius, length, width, lives, levels;
    
    public int GetXPosition() {
        
        return x;
    }
    
    public int GetYPosition() {
        
        return y;
    }
    
    public int GetXVelocity() {
       
        return vx;
    }
    
    public int GetYVelocity() {
        return vy;
    }
    
    public int GetRadius(){
        return radius;
    }
    public void SetPosition() {
        this.x += vx;
        this.y += vy;
    }
    public void SetPosition(int inX, int inY) {
        this.x += inX;
        this.y += inY;
    }
    
    public void SetRadius(int r) {
        this.radius = r;
    }
    
}
