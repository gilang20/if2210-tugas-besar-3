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
public class WallTest {
  
  public WallTest() {
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
   * Test of getAdditionalSpeed method, of class Wall.
   */
  @Test
  public void testGetAdditionalSpeed() {
    System.out.println("getAdditionalSpeed");
    Wall instance = new Wall();
    int expResult = 0;
    int result = instance.getAdditionalSpeed();
    assertEquals(expResult, result);
  }
  
}
