/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AtariBreakout;

/**
 *
 * @author Dcolb
 */
public class TestMain {
     public static void main(String args[]){
         Circle c = new Circle();
         Rectangle r = new Rectangle();
         Collision Col = new Collision();
         Score s = new Score();
         c.SetRadius(5);
         c.SetPosition(240, 120);
         r.SetXPos(120);
         r.SetYPos(120);
         r.SetLength(60);
         if(Col.collide(c,r )){
            System.out.println("You are not a fucking idiot");
            s.addScore();
            System.out.println("you have earned " + s.GetScore() + " points");
         }
         else{
             System.out.println("You are a fucking idiot");
             System.out.println("you have earned " + s.GetScore() + " points");
         }
     }
}
