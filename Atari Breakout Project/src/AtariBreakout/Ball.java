/** CMPSCI 221 Final Project
 * Circle.java
 * Purpose: Create a circle class for the final project
 * @author samfarhady and Dylan Colburn
 */
package AtariBreakout;

public class Ball {
    private int   r , x, y;
    private double vx, vy;

    public int GetXPosition(){
        return x;
    }
    public void SetXPosition(int Xnew){
        x = Xnew;
    }
     public int GetYPosition(){
        return y;
    }
    public void SetYPosition(int Ynew){
        y = Ynew;
    }
    public void SetYPosition(){
        y += vy;
    }
    public void SetXPosition(){
        x += vx;
    }
    public double GetXVelocity() {
       
        return vx;
    }
    
    public double GetYVelocity() {
        return vy;
    }
    
    public void SetYVelocity(int yv){
        this.vy = yv;
    }
    
    public void SetXVelocity(int xv){
        this.vx = xv;
    }
    public void FlipXVelocity(){
        vx *= -1;
    }
    public void FlipYVelocity(){
        vy *= -1;
    }
    public int GetRadius(){
        return r;
    }
    public void SetRadius(int rad){
        r = rad;
    }
    public void Accelerate(){
        vx *= 1.2;
        vy *= 1.2;
    }
    
  

    
}
