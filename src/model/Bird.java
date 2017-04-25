/**
 * Nama : Arno Alexander
 * NIM : 13515141
 * Kelompok : Komodo Dragon
 */

package model;

/**
 * Merepresentasikan burung.
 * @author Arno
 */
public class Bird extends Enemy{
  /*Kecepatan tambahan untuk tembok*/
  private static final int ADDITIONAL_SPEED = -3;
  
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
