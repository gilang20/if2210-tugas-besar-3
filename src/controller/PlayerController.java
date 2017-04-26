/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controller;

import javax.swing.JLabel;
import model.Player;
import model.Sound;

/**
 * Controller untuk model Player.
 * @author Asus
 */
public class PlayerController extends Thread {
  
  /*Model untuk player*/
  private Player playerModel;
  /*Tampilan player yang dikontrol*/
  private JLabel playerView;
  /**
   * Apakah ada sinyal dari pengguna untuk melompat.
   */
  public boolean isStartJumping;
  
  
  /**
   * Konstruktor.
   * @param playerView view dari player.
   */
  public PlayerController(JLabel playerView) {
    this.playerView = playerView;
    isStartJumping = false;
    playerModel = new Player();
    playerModel.setAbsis(playerView.getX());
    playerModel.setOrdinat(playerView.getY());
    playerModel.setHeight(playerView.getHeight());
    playerModel.setWidth(playerView.getWidth());
  }
  
  /**
   * Membuat pemain melompat.
   */
  public void jump() {
    int initialOrdinat;
    initialOrdinat = playerModel.getOrdinat();
    int verticalDelay = 92;
    Sound sound = new Sound("src/assets/Jump.wav");
    sound.playSound();
    do {
      playerModel.setOrdinat(playerView.getY() - 1);
      playerView.setLocation(playerModel.getAbsis(), playerModel.getOrdinat());
      try {
        sleep(verticalDelay / 92);
      } catch (InterruptedException ex) {
        System.out.println("InterruptedException");
      }
      verticalDelay++;
    } while (verticalDelay < 277);
    do {
      playerModel.setOrdinat(playerView.getY() + 1);
      playerView.setLocation(playerModel.getAbsis(), playerModel.getOrdinat());
      try {
        sleep(verticalDelay / 92);
      } catch (InterruptedException ex) {
        System.out.println("InterruptedException");
      }
      verticalDelay--;
    } while (verticalDelay > 92);
    playerView.setLocation(playerModel.getAbsis(), initialOrdinat);
    isStartJumping = false;
  }
  
  @Override
  public void run() {
    while (true) {
      try {
        sleep(10);
      } catch (InterruptedException ex) {
        System.out.println("InterruptedException");
      }
      if (isStartJumping) {
        jump();
        isStartJumping = false;
      }
    }
  }
  
  /**
   * Getter PlayerModel.
   * @return model untuk Player
   */
  public Player getPlayerModel() {
    return playerModel;
  }
}
