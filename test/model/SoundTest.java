/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.File;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


/**
 *
 * @author adyanaufalF
 */
public class SoundTest {
  public SoundTest() {
  }
  
  @BeforeClass
  public static void setUpClass() {
  }
  
  @AfterClass
  public static void tearDownClass() {
  }
  
  @Before
  public void setUp() {
  }
  
  @After
  public void tearDown() {
  }

  /**
   * Test of setAbsis method, of class Player.
   */
  @Test
  public void testGetSoundFile() {
    System.out.println("getSoundFile");
    Sound instance = new Sound("src/assets/Jump.wav");
    File result = instance.getSoundFile();
    File expResult = new File("src/assets/Jump.wav");
    assertEquals(expResult, result);
  }
  
  
}
