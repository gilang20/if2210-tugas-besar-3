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
 *
 * @author Asus
 */
public class BulletTest {
  
  public BulletTest() {
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
   * Test of getAdditionalSpeed method, of class Bullet.
   */
  @Test
  public void testGetAdditionalSpeed() {
    System.out.println("getAdditionalSpeed");
    Bullet instance = new Bullet();
    int expResult = 3;
    int result = instance.getAdditionalSpeed();
    assertEquals(expResult, result);
  }
  
}
