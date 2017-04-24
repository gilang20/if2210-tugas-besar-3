/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

/**
 * Interface untuk model yang dapat ditampilkan dalam GUI.
 * @author Asus
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
   * Getter alamat asset yang digunakan.
   * @return alamat asset.
   */
  public String getAsset();
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
  /**
   * Setter lokasi dari asset.
   * @param assetLocation lokasi asset
   */
  public void setAsset(String assetLocation);
}
