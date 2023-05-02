/** CMPSCI 221 Final Project
 * Rectangle.java
 * Purpose: Create a rectangle class for the final project
 * @author samfarhady and Dylan Colburn
 */
package AtariBreakout;

public class Rectangles {
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
