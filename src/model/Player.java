/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

/**
 * Merepresentasikan player yang dapat dikontrol.
 * @author Asus
 */
public class Player implements Renderable{
  /*Ordinat pemain saat menginjak tanah*/
  private int defaultOrdinat; 
  /*Absis*/
  private int absis;
  /*Ordinat*/
  private int ordinat;
  /*Lebar*/
  private int width;
  /*Ketinggian*/
  private int height;
  
  /**
   * Konstruktor.
   */
  public Player() {
    this.absis = 0;
    this.ordinat = 0;
    this.width = 0;
    this.height = 0;
    defaultOrdinat = 0;
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
   * @return ordinat
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
   * Getter default ordinat, yaitu ordinat saat player berada di tanah.
   * @return default ordinat.
   */
  public int getDefaultOrdinat() {
    return defaultOrdinat;
  }
  
  /**
   * Setter default ordinat, yaitu ordinat saat pemain memijak tanah.
   * @param defaultOrdinat default ordinat
   */
  public void setDefaultOrdinat(int defaultOrdinat) {
    this.defaultOrdinat = defaultOrdinat;
  }
}
