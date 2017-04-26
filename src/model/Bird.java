/*
 * File : Bird.java
 * Nama : Gilang Ardyamandala Al Assyifa
 * NIM  : 13515096
 * Kel. : Komodo Dragon
 */

package model;

/**
 * Merepresentasikan burung.
 * @author Gilang
 */
public class Bird extends Enemy {
  /*Kecepatan tambahan untuk tembok*/
  private static final int ADDITIONAL_SPEED = -2;
  
  /**
   * Konstruktor.
   */
  public Bird() {
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
