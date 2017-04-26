/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

/**
 * Merepresentasikan peluru.
 * @author Rio
 */
public class Bullet extends Enemy {
  /*Kecepatan tambahan untuk peluru*/
  private static final int ADDITIONAL_SPEED = 3;
  
  /**
   * Konstruktor.
   */
  public Bullet() {
    super();
  }
  
  /**
   * Getter kecepatan tambahan sesuai jenis musuh.
   * @return kecepatan tambahan
   */
  @Override
  public int getAdditionalSpeed() {
    return ADDITIONAL_SPEED;
  }
}
