/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

/**
 * Merepresentasikan tembok, salah satu jenis musuh.
 * @author Asus
 */
public class Wall extends Enemy {
  /*Kecepatan tambahan untuk tembok*/
  private static final int ADDITIONAL_SPEED = 0;
  
  /**
   * Konstruktor.
   * @param asset lokasi asset
   */
  public Wall(String asset) {
    super(asset);
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
