/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

import javax.sound.sampled.*;
import java.io.File;

/**
 * Merepresentasikan suara.
 * @author adyanaufalF
 */
public class Sound {
  
  private File sourceFile;
  
  /**
   * Konstruktor.
   * @param file untuk namafile
   */
  public Sound(String file) {
    sourceFile = new File(file);
  }
  
  /**
   * Memainkan suara.
   */
  public synchronized void playSound() {
    new Thread(new Runnable() {
    // The wrapper thread is unnecessary, unless it blocks on the
    // Clip finishing; see comments.
      @Override
      public void run() {
        try {
          Clip clip = AudioSystem.getClip();
          AudioInputStream inputStream = AudioSystem.getAudioInputStream(
                  sourceFile);
          clip.open(inputStream);
          clip.start(); 
        } catch (Exception e) {
          System.err.println(e.getMessage());
        }
      }
    }).start();
  }
  
  public File getSoundFile() {
    return sourceFile;
  }
}
