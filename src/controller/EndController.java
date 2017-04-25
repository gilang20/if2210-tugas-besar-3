/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controller;

import java.util.logging.Level;
import java.util.logging.Logger;
import model.GameState;
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
    endDialog.getParent().setVisible(false);
    endDialog.getScore().setText("Score = " + endDialog.getParent()
        .getScorePanel().getDataController().getGameStateModel().getScore());
    endDialog.getHighScore().setText("High Score = " + GameState.getHighScore());
    endDialog.setVisible(true);
  }
}
