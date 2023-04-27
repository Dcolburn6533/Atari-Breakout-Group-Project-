/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AtariBreakout;

/**
 *
 * @author samfarhady
 */
public class Rectangle {
    private int x, y, length, width;
    
    public int GetXPos() {
        return x;
    }
    
    public int GetYPos() {
        return y;
    }
    
    public int GetLength(){
        return length;
    }
    
    public int GetWidth() {
        return width;
    }
    
    public void SetXPos(int mx) {
        this.x = mx;
    }
    
    public void SetYPos(int my) {
        this.y = my;
    }
    
    public void SetLength(int l) {
        this.length = l;
    }
    
    public void SetWidth(int w) {
        this.width = w;
    }
}
