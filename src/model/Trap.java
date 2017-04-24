/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Rio
 */
public class Trap extends Enemy {
  /*Kecepatan tambahan untuk jebakan*/
  private static final int ADDITIONAL_SPEED = 3;
  
  /**
   * Konstruktor.
   */
  public Trap() {
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
