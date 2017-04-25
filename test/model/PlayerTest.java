/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Test untuk Player.
 * @author Asus
 */
public class PlayerTest {
  
  public PlayerTest() {
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
   * Test of getAbsis method, of class Player.
   */
  @Test
  public void testGetAbsis() {
    System.out.println("getAbsis");
    Player instance = new Player();
    int expResult = 0;
    int result = instance.getAbsis();
    assertEquals(expResult, result);
  }

  /**
   * Test of getOrdinat method, of class Player.
   */
  @Test
  public void testGetOrdinat() {
    System.out.println("getOrdinat");
    Player instance = new Player();
    int expResult = 0;
    int result = instance.getOrdinat();
    assertEquals(expResult, result);
  }

  /**
   * Test of getWidth method, of class Player.
   */
  @Test
  public void testGetWidth() {
    System.out.println("getWidth");
    Player instance = new Player();
    int expResult = 0;
    int result = instance.getWidth();
    assertEquals(expResult, result);
  }

  /**
   * Test of getHeight method, of class Player.
   */
  @Test
  public void testGetHeight() {
    System.out.println("getHeight");
    Player instance = new Player();
    int expResult = 0;
    int result = instance.getHeight();
    assertEquals(expResult, result);
  }

  /**
   * Test of setAbsis method, of class Player.
   */
  @Test
  public void testSetAbsis() {
    System.out.println("setAbsis");
    int absis = 10;
    Player instance = new Player();
    instance.setAbsis(absis);
    int result = instance.getAbsis();
    int expResult = 10;
    assertEquals(expResult, result);
  }

  /**
   * Test of setOrdinat method, of class Player.
   */
  @Test
  public void testSetOrdinat() {
    System.out.println("setOrdinat");
    int ordinat = 11;
    Player instance = new Player();
    instance.setOrdinat(ordinat);
    int result = instance.getOrdinat();
    int expResult = 11;
    assertEquals(expResult, result);
  }

  /**
   * Test of setWidth method, of class Player.
   */
  @Test
  public void testSetWidth() {
    System.out.println("setWidth");
    int width = 33;
    Player instance = new Player();
    instance.setWidth(width);
    int result = instance.getWidth();
    int expResult = 33;
    assertEquals(expResult, result);
  }

  /**
   * Test of setHeight method, of class Player.
   */
  @Test
  public void testSetHeight() {
    System.out.println("setHeight");
    int height = 44;
    Player instance = new Player();
    instance.setHeight(height);
    int result = instance.getHeight();
    int expResult = 44;
    assertEquals(expResult, result);
  }

  /**
   * Test of getDefaultOrdinat method, of class Player.
   */
  @Test
  public void testGetDefaultOrdinat() {
    System.out.println("getDefaultOrdinat");
    Player instance = new Player();
    int expResult = 0;
    int result = instance.getDefaultOrdinat();
    assertEquals(expResult, result);
  }

  /**
   * Test of setDefaultOrdinat method, of class Player.
   */
  @Test
  public void testSetDefaultOrdinat() {
    System.out.println("setDefaultOrdinat");
    int defaultOrdinat = 56;
    Player instance = new Player();
    instance.setDefaultOrdinat(defaultOrdinat);
    int result = instance.getDefaultOrdinat();
    int expResult = 56;
    assertEquals(expResult, result);
  }
  
}
