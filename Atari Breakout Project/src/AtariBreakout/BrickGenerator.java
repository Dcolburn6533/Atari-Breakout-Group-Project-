
package AtariBreakout;

import java.awt.*;
import java.util.*;
public class BrickGenerator {
    public int map[][];
    public int brickWidth;
    public int brickHeight;
    
    public BrickGenerator(int r, int c){
        map = new int[r][c];
        for(int i = 0; i < map.length; i++){
            for(int j = 0; j < map[0].length; j++){
                map[i][j] = 1;
            }
        }
        
        
        brickWidth = 540/c;
        brickHeight = 50;
    }
    
    public void draw(Graphics2D g){
        for(int i = 0; i < map.length; i++){
            for (int j =0; j<map[0].length; j++){
                if (map[i][j] > 0){
                    Random rand = new Random();
                     int randomNum = rand.nextInt(5) ;
                     if (i== 0){
                         g.setColor(Color.blue);
                     }
                   else  if (i == 1){
                         g.setColor(Color.red);
                     }
                  else   if (i == 2){
                         g.setColor(Color.green);
                     }
                    else if (i == 3){
                         g.setColor(Color.orange);
                     }
                   else  if (i == 4){
                         g.setColor(Color.YELLOW);
                     }
                   else{
                       g.setColor(Color.PINK);
                   }
                    
                    g.fillRect(j * brickWidth + 80, i * brickHeight + 50, brickWidth, brickHeight);
                    g.setStroke(new BasicStroke(3));
                    
                    g.setColor(Color.BLACK);
                    g.drawRect(j * brickWidth + 80, i * brickHeight + 50, brickWidth, brickHeight);
                }
            }
        }
    }
    
   public void setBrickBalue(int value, int r, int c){
       map[r][c] = value;
   }
}
