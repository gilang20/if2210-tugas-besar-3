/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

/**
 * Merepresentasikan musuh.
 * @author Asus
 */
public abstract class Enemy implements Renderable{

  /**
   * Nilai minimum base speed (kecepatan minimum musuh saat bergerak ke kiri).
   */
  public static final int MIN_BASE_SPEED = 10;
  /*Absis*/
  private int absis;
  /*Ordinat*/
  private int ordinat;
  /*Lebar*/
  private int width;
  /*Ketinggian*/
  private int height;
  /*Kecepatan dasar*/
  private int baseSpeed;
  
  /**
   * Konstruktor.
   */
  public Enemy() {
    this.absis = 0;
    this.ordinat = 0;
    baseSpeed = MIN_BASE_SPEED;
  }
  
  /**
   * Getter absis dalam koordinat.
   * @return absis.
   */
  @Override
  public int getAbsis() {
    return absis;
  }
  
  /**
   * Getter ordinat dalam koordinat.
   * @return ordinat.
   */
  @Override
  public int getOrdinat() {
    return ordinat;
  }
  
  /**
   * Getter lebar.
   * @return lebar
   */
  @Override
  public int getWidth() {
    return width;
  }
  
  /**
   * Getter tinggi.
   * @return tinggi
   */
  @Override
  public int getHeight() {
    return height;
  }
  
  /**
   * Setter absis dalam koordinat.
   * @param absis absis
   */
  @Override
  public void setAbsis(int absis) {
    this.absis = absis;
  }
  
  /**
   * Setter ordinat dalam koordinat.
   * @param ordinat ordinat
   */
  @Override
  public void setOrdinat(int ordinat) {
    this.ordinat = ordinat;
  }
  
  /**
   * Setter lebar.
   * @param width lebar 
   */
  @Override
  public void setWidth(int width) {
    this.width = width;
  }
  
  /**
   * Setter tinggi.
   * @param height tinggi
   */
  @Override
  public void setHeight(int height) {
    this.height = height;
  }
  
  /**
   * Getter base speed, yaitu kecepatan minimum gerakan musuh ke kiri.
   * @return base speed
   */
  public int getBaseSpeed() {
    return baseSpeed;
  }
  
  /**
   * Getter kecepatan tambahan sesuai jenis musuh.
   * @return kecepatan tambahan
   */
  public abstract int getAdditionalSpeed();
  
  /**
   * Setter base speed, yaitu kecepatan minimum gerakan musuh ke kiri.
   * @param baseSpeed base speed
   */
  public void setBaseSpeed(int baseSpeed) {
    this.baseSpeed = baseSpeed;
  }
}
