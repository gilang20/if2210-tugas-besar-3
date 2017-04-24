/*
 * File : Cactus.java
 * Nama : Gilang Ardyamandala Al Assyifa
 * NIM  : 13515096
 * Kel. : Komodo Dragon
 */

package model;

/**
 * Kelas Cactus, salah satu jenis musuh.
 * @author Gilang
 */
public class Cactus extends Enemy {
  /*Kecepatan tambahan untuk tembok*/
  private static final int ADDITIONAL_SPEED = 0;
  
  /**
   * Konstruktor.
   */
  public Cactus() {
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
