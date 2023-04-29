/** CMPSCI 221 Final Project
 * Score.java
 * Purpose: Create a score class for the final project
 * @author samfarhady
 */
package AtariBreakout;

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
