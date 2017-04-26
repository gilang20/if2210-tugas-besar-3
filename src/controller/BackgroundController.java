/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controller;

import model.Background;
import view.GamePanel;

/**
 * Controller untuk background.
 * @author adyanaufalF
 */
public class BackgroundController extends Thread {
  /*Model untuk background*/
  private Background backgroundModel;
  /*Tampilan background game yang dikontrol*/
  private GamePanel gamePanel;
  
  /**
   * Konstruktor.
   * @param gamePanel view dari GamePanel.
   */
  public BackgroundController(GamePanel gamePanel) {
    backgroundModel = new Background();
    this.gamePanel = gamePanel;
    this.gamePanel.setBackground(Background.DAY_BACKGROUND_COLOR);
  }
  
  
  @Override
  public void run() {
    gamePanel.setOpaque(true);
    long backgroundTime = System.nanoTime();
    while (true) {
      try {
        sleep(100);
      } catch (InterruptedException ex) {
        System.out.println("InterruptedException");
      }
      if (backgroundModel.getBackgroundColor().equals(Background
          .DAY_BACKGROUND_COLOR)) {
        if ((System.nanoTime() - backgroundTime) / 1000 > 45 * 1000000) {
          gamePanel.setBackground(Background.NIGHT_BACKGROUND_COLOR);
          backgroundModel.setBackgroundColor(Background.NIGHT_BACKGROUND_COLOR);
          backgroundTime = System.nanoTime();
        }
      } else {
        if ((System.nanoTime() - backgroundTime) / 1000 > 20 * 1000000) {
          gamePanel.setBackground(Background.DAY_BACKGROUND_COLOR);
          backgroundModel.setBackgroundColor(Background.DAY_BACKGROUND_COLOR);
          backgroundTime = System.nanoTime();
        }
      }
    }
  }
  
  /**
   * Getter BackgroundModel.
   * @return model untuk Background
   */
  public Background getBackgroundModel() {
    return backgroundModel;
  }
}
