/** CMPSCI 221 Final Project
 * Collision.java
 * Purpose: Create a score class for the final project
 * @author Dcolb and @author samfarhady
 */
package AtariBreakout;

import java.awt.Rectangle;

public class Collision {
    public boolean collide(Ball ball, BrickGenerator Bricks) {
       for(int i = 0; i < Bricks.map.length; i ++){
               for(int j = 0; j < Bricks.map[0].length; j++){
                   if(Bricks.map[i][j] > 0){
                   int brickX = j * Bricks.brickWidth + 80;
                   int brickY = i * Bricks.brickHeight + 50;
                   int brickWidth = Bricks.brickWidth;
                   int brickHeight = Bricks.brickHeight;
                   
                   Rectangle rect = new Rectangle(brickX, brickY, brickWidth, brickHeight);
                   Rectangle ballRect = new Rectangle(ball.GetXPosition(), ball.GetYPosition(), ball.GetRadius(), ball.GetRadius());
                   Rectangle brickRect = rect;
                   
                   if(ballRect.intersects(brickRect)){
      
                       
                       return true;
                   }
                   
               }
               }
           }
       return false;
}
    
    public int collideI(Ball ball, BrickGenerator Bricks) {
       for(int i = 0; i < Bricks.map.length; i ++){
               for(int j = 0; j < Bricks.map[0].length; j++){
                   if(Bricks.map[i][j] > 0){
                   int brickX = j * Bricks.brickWidth + 80;
                   int brickY = i * Bricks.brickHeight + 50;
                   int brickWidth = Bricks.brickWidth;
                   int brickHeight = Bricks.brickHeight;
                   
                   Rectangle rect = new Rectangle(brickX, brickY, brickWidth, brickHeight);
                   Rectangle ballRect = new Rectangle(ball.GetXPosition(), ball.GetYPosition(), ball.GetRadius(), ball.GetRadius());
                   Rectangle brickRect = rect;
                   
                   if(ballRect.intersects(brickRect)){
      
                       
                       return i;
                   }
                   
               }
               }
           }
      return 0;
}
    
        public int collideJ(Ball ball, BrickGenerator Bricks) {
       for(int i = 0; i < Bricks.map.length; i ++){
               for(int j = 0; j < Bricks.map[0].length; j++){
                   if(Bricks.map[i][j] > 0){
                   int brickX = j * Bricks.brickWidth + 80;
                   int brickY = i * Bricks.brickHeight + 50;
                   int brickWidth = Bricks.brickWidth;
                   int brickHeight = Bricks.brickHeight;
                   
                   Rectangle rect = new Rectangle(brickX, brickY, brickWidth, brickHeight);
                   Rectangle ballRect = new Rectangle(ball.GetXPosition(), ball.GetYPosition(), ball.GetRadius(), ball.GetRadius());
                   Rectangle brickRect = rect;
                   
                   if(ballRect.intersects(brickRect)){
      
                       
                       return j;
                   }
                   
               }
               }
           }
      return 0;
}
    
   
        
     
    
}
