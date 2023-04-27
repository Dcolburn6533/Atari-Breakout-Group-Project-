/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AtariBreakout;

/**
 *
 * @author samfarhady
 */
public class Score {
    private int lives, levels, score;
    
    public int getLevels(int levels) {
        return levels;
    }
    
    public int getLives(int lives) {
        return lives;
    }
    
    public int getScore(int score) {
        return score;
    }
    
    public void setLevels(int levels) {
        this.levels = levels;
    }
    
    public void setLives(int lives) {
        this.lives = lives;
    }
    
    public void addScore(int score) {
        this.score = score;
    }
}
