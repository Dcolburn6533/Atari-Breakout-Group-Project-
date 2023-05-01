/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AtariBreakout;

public class TestMain {
     public static void main(String args[]){
         Circle c = new Circle();
         Rectangle r = new Rectangle();
         Collision Col = new Collision();
         Score s = new Score();
         c.SetRadius(5);
         c.SetPosition(240, 120);
         c.SetXVelocity(10);
         c.SetYVelocity(20);
         r.SetXPos(220);
         r.SetYPos(120);
         r.SetLength(60);
         if(Col.collide(c,r )){
            System.out.println("It works");
            s.addScore();
            System.out.println("you have earned " + s.GetScore() + " points");
         }
         else{
             System.out.println("It doesnt work");
             System.out.println("you have earned " + s.GetScore() + " points");
         }
         
         c.SetPosition();
          if(Col.collide(c,r )){
            System.out.println("it works");
            s.addScore();
            System.out.println("you have earned " + s.GetScore() + " points");
         }
         else{
             System.out.println("It doesnt work");
             System.out.println("you have earned " + s.GetScore() + " points");
         }
          
          LaunchGui textFieldFrame = new LaunchGui(); 
           textFieldFrame.setSize( 600, 600 ); // set frame size
    
           textFieldFrame.setVisible( true );
     }
}
