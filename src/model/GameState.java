/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model;
import java.io.*;
import java.util.Scanner;

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
   * @throws java.io.FileNotFoundException exception
   */
  public GameState() throws FileNotFoundException {
    score = 0;
    level = 0;
    loadHighScore();
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
  
  /**
   * Loader data highScore.
   * @throws java.io.FileNotFoundException exception
   */
  public void loadHighScore() throws FileNotFoundException{
    Scanner fileScanner = new Scanner(new File("src/data/HighScore.txt"));
    highScore = fileScanner.nextInt();
  }
  
  /**
   * Saving data highScore.
   * @throws java.io.FileNotFoundException exception
   */
  public void saveHighScore() throws FileNotFoundException{
    File Fileout = new File("src/data/HighScore.txt");
    PrintWriter fileWriter = new PrintWriter(Fileout);
    fileWriter.println(highScore);
    fileWriter.flush();
  }
}
