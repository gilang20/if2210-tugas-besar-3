/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Test untuk GameState
 * @author Asus
 */
public class GameStateTest {
  
  public GameStateTest() {
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
   * Test of getHighScore method, of class GameState.
   */
  @Test
  public void testGetHighScore() {
    System.out.println("getHighScore");
    int expResult = GameState.getHighScore();
    int result = GameState.getHighScore();
    assertEquals(expResult, result);
  }

  /**
   * Test of getScore method, of class GameState.
   */
  @Test
  public void testGetScore() {
    System.out.println("getScore");
    GameState instance;
    try {
      instance = new GameState();
      int expResult = 0;
      int result = instance.getScore();
      assertEquals(expResult, result);
    } catch (FileNotFoundException ex) {
      Logger.getLogger(GameStateTest.class.getName()).log(Level.SEVERE, null, ex);
    }
  }

  /**
   * Test of getLevel method, of class GameState.
   */
  @Test
  public void testGetLevel() {
    System.out.println("getLevel");
    GameState instance;
    try {
      instance = new GameState();
      int expResult = 0;
      int result = instance.getLevel();
      assertEquals(expResult, result);
    } catch (FileNotFoundException ex) {
      Logger.getLogger(GameStateTest.class.getName()).log(Level.SEVERE, null, ex);
    }
  }

  /**
   * Test of setHighScore method, of class GameState.
   */
  @Test
  public void testSetHighScore() {
    System.out.println("setHighScore");
    int highScore = 100;
    GameState.setHighScore(highScore);
    int result = GameState.getHighScore();
    int expResult = 100;
    assertEquals(expResult, result);
  }

  /**
   * Test of setScore method, of class GameState.
   */
  @Test
  public void testSetScore() {
    System.out.println("setScore");
    int score = 101;
    GameState instance;
    try {
      instance = new GameState();
      instance.setScore(score);
      int result = instance.getScore();
      int expResult = 101;
      assertEquals(expResult, result);
    } catch (FileNotFoundException ex) {
      Logger.getLogger(GameStateTest.class.getName()).log(Level.SEVERE, null, ex);
    }
  }

  /**
   * Test of setLevel method, of class GameState.
   */
  @Test
  public void testSetLevel() {
    System.out.println("setLevel");
    int level = 20;
    GameState instance;
    try {
      instance = new GameState();
      instance.setLevel(level);
      int result = instance.getLevel();
      int expResult = 20;
      assertEquals(expResult, result);
    } catch (FileNotFoundException ex) {
      Logger.getLogger(GameStateTest.class.getName()).log(Level.SEVERE, null, ex);
    }
  }

  /**
   * Test of loadHighScore method, of class GameState.
   */
  @Test
  public void testLoadHighScore() throws Exception {
    System.out.println("loadHighScore");
    GameState instance = new GameState();
    instance.loadHighScore();
  }

  /**
   * Test of saveHighScore method, of class GameState.
   */
  @Test
  public void testSaveHighScore() throws Exception {
    System.out.println("saveHighScore");
    GameState instance = new GameState();
    instance.saveHighScore();
  }
  
}
