/*
 * Nama : Arno Alexander.
 * NIM : 13515141.
 * Kelompok : Komodo Dragon.
 */

package model;

/**
 * Interface untuk model yang dapat ditampilkan dalam GUI.
 * @author Arno
 */
public interface Renderable {
  /**
   * Getter absis dalam koordinat.
   * @return absis.
   */
  public int getAbsis();
  /**
   * Getter ordinat dalam koordinat.
   * @return ordinat.
   */
  public int getOrdinat();
  /**
   * Getter lebar.
   * @return lebar
   */
  public int getWidth();
  /**
   * Getter tinggi.
   * @return tinggi
   */
  public int getHeight();
  /**
   * Setter absis dalam koordinat.
   * @param absis absis
   */
  public void setAbsis(int absis);
  /**
   * Setter ordinat dalam koordinat.
   * @param ordinat ordinat
   */
  public void setOrdinat(int ordinat);
   /**
   * Setter lebar.
   * @param width lebar 
   */
  public void setWidth(int width);
  /**
   * Setter tinggi.
   * @param height tinggi
   */
  public void setHeight(int height);
}
