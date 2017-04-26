/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controller;

import model.GameState;
import model.Sound;
import view.EndDialog;

/**
 * Controller untuk EndDialog.
 * @author Asus
 */
public class EndController {
  /*EndDialog yang dikontrol*/
  private EndDialog endDialog;
  
  /**
   * Konstruktor.
   * @param endDialog EndDialog yang dikontrol 
   */
  public EndController(EndDialog endDialog) {
    this.endDialog = endDialog;
  }
  
  /**
   * Menghentikan thread-thread dari game.
   */
  public void endGame() {
    endDialog.getParent().getGamePanel().getPlayerController().stop();
    endDialog.getParent().getScorePanel().getDataController().stop();
    endDialog.getParent().getGamePanel().getBackgroundController().stop();
    Sound sound = new Sound("src/assets/Die.wav");
    sound.playSound();
    endDialog.getParent().setVisible(false);
    endDialog.getScore().setText("Score = " + endDialog.getParent()
        .getScorePanel().getDataController().getGameStateModel().getScore());
    endDialog.getHighScore().setText("High Score = " + GameState.getHighScore());
    endDialog.setVisible(true);
    endDialog.getParent().getGamePanel().getEnemyController().stop();
  }
}
