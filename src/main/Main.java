/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package main;

import view.MainFrame;

/**
 * Kelas yang berisi program utama.
 * @author Asus
 */
public class Main {

  /**
   * Program utama.
   * @param args argumen
   */
  public static void main(String[] args) {
    new Thread() {
      @Override
      public void run() {
        new MainFrame();
      }
    }.start();
  }
  
}
