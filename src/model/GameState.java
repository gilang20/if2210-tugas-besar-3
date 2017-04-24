/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

/**
 * Merepresentasikan setiap round dari game.
 * @author Asus
 */
public class GameState {
  private static int highScore = 0;
  private int score;
  private int level;
  
  /**
   * Konstruktor.
   */
  public GameState() {
    score = 0;
    level = 0;
  }
  
  /**
   * Getter high score.
   * @return high score
   */
  public static int getHighScore() {
    return highScore;
  }
  
  /**
   * Getter score.
   * @return score
   */
  public int getScore() {
    return score;
  }
  
  /**
   * Getter level.
   * @return level
   */
  public int getLevel() {
    return level;
  }
  
  /**
   * Setter high score.
   * @param highScore high score
   */
  public static void setHighScore(int highScore) {
    GameState.highScore = highScore;
  }
  
  /**
   * Setter score.
   * @param score score
   */
  public void setScore(int score) {
    this.score = score;
  }
  
  /**
   * Setter level.
   * @param level level
   */
  public void setLevel(int level) {
    this.level = level;
  }
}
