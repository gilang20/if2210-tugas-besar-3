/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

import java.awt.Color;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Test untuk background.
 * @author Asus
 */
public class BackgroundTest {
  
  public BackgroundTest() {
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
   * Test of getBackgroundColor method, of class Background.
   */
  @Test
  public void testGetBackgroundColor() {
    System.out.println("getBackgroundColor");
    Background instance = new Background();
    Color expResult = Background.DAY_BACKGROUND_COLOR;
    Color result = instance.getBackgroundColor();
    assertEquals(expResult, result);
  }

  /**
   * Test of setBackgroundColor method, of class Background.
   */
  @Test
  public void testSetBackgroundColor() {
    System.out.println("setBackgroundColor");
    Color color = Background.NIGHT_BACKGROUND_COLOR;
    Color expResult = color;
    Background instance = new Background();
    instance.setBackgroundColor(color);
    Color result = instance.getBackgroundColor();
    assertEquals(expResult, result);
  }
  
}
