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
    
    public int GetLevels() {
        return levels;
    }
    
    public int GetLives() {
        return lives;
    }
    
    public int GetScore() {
        return score;
    }
    
    public void SetLevels(int levels) {
        this.levels = levels;
    }
    
    public void SetLives(int lives) {
        this.lives = lives;
    }
    
    public void addScore() {
        this.score += 5;
    }
}
