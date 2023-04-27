/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AtariBreakout;

/**
 *
 * @author samfarhady
 */
public class Circle {
    private int x, y, vx, vy, r, length, width, lives, levels;
    
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
        return r;
    }
    
}
