/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controller;

import javax.swing.JLabel;
import model.Player;

/**
 * Controller untuk model Player.
 * @author Asus
 */
public class PlayerController {
  /*Model untuk player*/
  private Player playerModel;
  /*Tampilan player yang dikontrol*/
  private JLabel playerView;
  
  /**
   * Konstruktor.
   */
  public PlayerController(JLabel playerView) {
    this.playerView = playerView;
    playerModel = new Player();
  }
  
  /**
   * Membuat pemain melompat.
   */
  public void jump() {
    
  }
}
