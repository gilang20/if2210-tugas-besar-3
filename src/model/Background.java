/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

import java.awt.Color;

/**
 * Merepresentasikan background permainan.
 * @author Asus
 */
public class Background {
  /**
   * Warna background siang.
   */
  public static final Color DAY_BACKGROUND_COLOR = new Color(125,200,255);
  /**
   * Warna background malam.
   */
  public static final Color NIGHT_BACKGROUND_COLOR = new Color(40,60,125);
  /*Warna background*/
  private Color backgroundColor;
  
  /**
   * Konstruktor.
   */
  public Background() {
    backgroundColor = DAY_BACKGROUND_COLOR;
  }
  
  /**
   * Konstruktor.
   * @param color warna background 
   */
  public Background(Color color) {
    backgroundColor = color;
  }
  
  /**
   * Getter warna background.
   * @return warna background
   */
  public Color getBackgroundColor() {
    return backgroundColor;
  }
  
  /**
   * Setter warna background.
   * @param color warna backgroind
   */
  public void setBackgroundColor(Color color) {
    backgroundColor = color;
  }
}
