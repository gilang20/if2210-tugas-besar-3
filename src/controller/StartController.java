/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controller;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import model.Sound;
import view.StartDialog;

/**
 * Controller untuk start.
 * @author Asus
 */
public class StartController {
  /*StartDialog yang dikontrol*/
  private StartDialog startDialog;
  
  /**
   * Konstruktor.
   * @param startDialog StartDialog yang dikontrol.
   */
  public StartController(StartDialog startDialog) {
    this.startDialog = startDialog;
  }
  
  /**
   * Menampilkan high score di menu.
   */
  public void displayHighScore() {
    Scanner fileScanner;
    try {
      fileScanner = new Scanner(new File("src/data/HighScore.txt"));
      int highScore = fileScanner.nextInt();
      startDialog.getHighScoreDisplay().setText("High Score = " + highScore);
      startDialog.pack();
    } catch (FileNotFoundException ex) {
      System.out.println("File Not Found");
    }
  }
  
  /**
   * Menjalankan thread-thread dari game.
   */
  public void startGame() {
    startDialog.setVisible(false);
    startDialog.getParent().getGamePanel().getPlayerController().start();
    startDialog.getParent().getGamePanel().getEnemyController().start();
    startDialog.getParent().getScorePanel().getDataController().start();
    startDialog.getParent().getGamePanel().getBackgroundController().start();
    Sound sound = new Sound("src/assets/Backsound.wav");
    sound.playSound();
  }
}
