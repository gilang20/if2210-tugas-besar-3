/*
 * File : EnemyController.java
 * Nama : Arno Alexander
 * NIM : 13515141
 * Kelompok : Komodo Dragon
 */

package controller;

import java.util.Random;
import java.util.Vector;
import javax.swing.JLabel;
import model.Bullet;
import model.Cactus;
import model.Enemy;
import model.Trap;
import model.Wall;
import view.GamePanel;

/**
 * Controller untuk musuh.
 * @author Asus
 */
public class EnemyController extends Thread{
  /**
   * Banyak maksimum dari enemy yang ditampilkan pada layar.
   */
  public static final int MAX_NUMBER_OF_ACTIVE_ENEMY = 2;
  /**
   * Jarak minimum antar enemy yang ditampilkan dalam layar.
   */
  public static final int MIN_DISTANCE_BETWEEN_ENEMY = 350;
  /**
   * Absis dari enemy yang tidak aktif.
   */
  public static final int ABSIS_FOR_INACTIVE_ENEMY = 715;
  /**
   * Absis minimum untuk enemy yang aktif.
   */
  public static final int MIN_ABSIS_FOR_ACTIVE_ENEMY = -60;
  /*Vector of JLabel dari musuh*/
  private Vector<JLabel> jlabelVector;
  /*Vector of Enemy, masing-masing berkorespondensi dengan jlabelVector pada
  indeks yang sama*/
  private Vector<Enemy> enemyVector;
  /*Banyaknya enemy yang sedang ditampilkan di layar*/
  private int numberOfActiveEnemy;
  /*Array dari indeks yang sedang ditampilkan di layar*/
  private int[] activeEnemy;
  /*Generator random*/
  private Random random;
  /*Referensi ke GamePanel*/
  private GamePanel gamePanel;
  
  /**
   * Konstruktor.
   * @param jlabelVector vector of JLabel
   * @param playerController referensi ke PlayerController
   */
  public EnemyController(Vector<JLabel> jlabelVector, 
      GamePanel gamePanel) {
    this.gamePanel = gamePanel;
    random = new Random(0b1111000101101001001011111000);
    numberOfActiveEnemy = 0;
    activeEnemy= new int[MAX_NUMBER_OF_ACTIVE_ENEMY];
    for (int i = 0; i < MAX_NUMBER_OF_ACTIVE_ENEMY; i++) {
      activeEnemy[i] = -1;
    }
    this.jlabelVector = jlabelVector;
    enemyVector = new Vector<>();
    for (int i = 0; i < jlabelVector.size(); i++) {
      if (jlabelVector.get(i).getName() == "wall") {
        Wall wall = new Wall();
        wall.setAbsis(jlabelVector.get(i).getX());
        wall.setOrdinat(jlabelVector.get(i).getY());
        wall.setHeight(jlabelVector.get(i).getHeight());
        wall.setWidth(jlabelVector.get(i).getWidth());
        enemyVector.add(wall);
      } else if (jlabelVector.get(i).getName() == "cactus") {
        Cactus cactus = new Cactus();
        cactus.setAbsis(jlabelVector.get(i).getX());
        cactus.setOrdinat(jlabelVector.get(i).getY());
        cactus.setHeight(jlabelVector.get(i).getHeight());
        cactus.setWidth(jlabelVector.get(i).getWidth());
        enemyVector.add(cactus);
      } else if (jlabelVector.get(i).getName() == "bullet") {
        Bullet bullet = new Bullet();
        bullet.setAbsis(jlabelVector.get(i).getX());
        bullet.setOrdinat(jlabelVector.get(i).getY());
        bullet.setHeight(jlabelVector.get(i).getHeight());
        bullet.setWidth(jlabelVector.get(i).getWidth());
        enemyVector.add(bullet);
      } else if (jlabelVector.get(i).getName() == "trap") {
        Trap trap = new Trap();
        trap.setAbsis(jlabelVector.get(i).getX());
        trap.setOrdinat(jlabelVector.get(i).getY());
        trap.setHeight(jlabelVector.get(i).getHeight());
        trap.setWidth(jlabelVector.get(i).getWidth());
        enemyVector.add(trap);
      } else {
        Wall wall = new Wall();
        wall.setAbsis(jlabelVector.get(i).getX());
        wall.setOrdinat(jlabelVector.get(i).getY());
        wall.setHeight(jlabelVector.get(i).getHeight());
        wall.setWidth(jlabelVector.get(i).getWidth());
        enemyVector.add(wall);
      }
    }
  }
  
  /**
   * Jika memungkinkan, tambahkan enemy ke layar.
   */
  private void addActiveEnemy() {
    boolean isThereFarRightEnemy = false;
    for (int i = 0; i < MAX_NUMBER_OF_ACTIVE_ENEMY; i++) {
      if (activeEnemy[i] >= 0) {
        isThereFarRightEnemy = jlabelVector.get(activeEnemy[i]).getParent()
            .getWidth() - enemyVector.get(activeEnemy[i]).getAbsis() 
            < MIN_DISTANCE_BETWEEN_ENEMY;
        if (isThereFarRightEnemy) {
          break;
        }
      }
    }
    if (!isThereFarRightEnemy) {
      int isAddNextEnemy = random.nextInt(20);
      if (isAddNextEnemy == 0) {
        int indexOfNewActivatedEnemy = random.nextInt(enemyVector.size());
        int count = 0;
        while (count < enemyVector.size() && enemyVector
            .get(indexOfNewActivatedEnemy).getAbsis() 
            < ABSIS_FOR_INACTIVE_ENEMY) {
          count++;
          indexOfNewActivatedEnemy = (indexOfNewActivatedEnemy + 1) 
              % enemyVector.size();
        }
        int index = 0;
        while (index < MAX_NUMBER_OF_ACTIVE_ENEMY) {
          if (activeEnemy[index] == -1) {
            break;
          }
          index++;
        }
        if (index < MAX_NUMBER_OF_ACTIVE_ENEMY) {
          activeEnemy[index] = indexOfNewActivatedEnemy;
          numberOfActiveEnemy++;
        }
      }
    }
  }
  
  /**
   * Memindahkan enemy yang ada pada layar.
   */
  private void moveActiveEnemy() {
    for (int i = 0; i < MAX_NUMBER_OF_ACTIVE_ENEMY; i++) {
      if (activeEnemy[i] >= 0) {
        int absis = enemyVector.get(activeEnemy[i]).getAbsis();
        absis -= (enemyVector.get(activeEnemy[i]).getBaseSpeed() 
            + enemyVector.get(activeEnemy[i]).getAdditionalSpeed()) / 4;
        enemyVector.get(activeEnemy[i]).setAbsis(absis);
        jlabelVector.get(activeEnemy[i]).setLocation(enemyVector.get(activeEnemy[i])
            .getAbsis(), enemyVector.get(activeEnemy[i]).getOrdinat());
      }
    }
  }
  
  /**
   * Memeriksa apakah enemy sudah terlalu di kiri.
   * Jika ya, kembalikan enemy menjadi inactive.
   */
  private void checkActiveEnemy() {
    for (int i = 0; i < MAX_NUMBER_OF_ACTIVE_ENEMY; i++) {
      if (activeEnemy[i] >= 0) {
        if (enemyVector.get(activeEnemy[i]).getAbsis() < MIN_ABSIS_FOR_ACTIVE_ENEMY) {
          enemyVector.get(activeEnemy[i]).setAbsis(ABSIS_FOR_INACTIVE_ENEMY);
          jlabelVector.get(activeEnemy[i]).setLocation(enemyVector
              .get(activeEnemy[i]).getAbsis(), enemyVector
              .get(activeEnemy[i]).getOrdinat());
          activeEnemy[i] = -1;
          numberOfActiveEnemy--;
        }
      }
    }
  }
  
  /**
   * Memeriksa apakah enemy bersentuhan dengan player.
   */
  private void checkPlayerContact() {
    boolean isContact = false;
    for (int i = 0; i < MAX_NUMBER_OF_ACTIVE_ENEMY; i++) {
      if (activeEnemy[i] >= 0) {
        if (enemyVector.get(activeEnemy[i]).getAbsis() 
            > gamePanel.getPlayerController().getPlayerModel().getAbsis() 
            - enemyVector.get(activeEnemy[i]).getWidth()
            && enemyVector.get(activeEnemy[i]).getAbsis()
            < gamePanel.getPlayerController().getPlayerModel().getAbsis()
            + gamePanel.getPlayerController().getPlayerModel().getWidth()) {
          if (enemyVector.get(activeEnemy[i]).getOrdinat()
              < gamePanel.getPlayerController().getPlayerModel().getOrdinat()
              + gamePanel.getPlayerController().getPlayerModel().getHeight()
              && enemyVector.get(activeEnemy[i]).getOrdinat()
              > gamePanel.getPlayerController().getPlayerModel().getOrdinat()
              - enemyVector.get(activeEnemy[i]).getHeight()) {
            isContact = true;
            break;
          }
        }
      }
    }
    if (isContact && !gamePanel.getParent().getEndDialog().isVisible()) {
      System.out.println("dead");
      gamePanel.getParent().getEndDialog().getEndController().endGame();
    }
  }
  
  @Override
  public void run() {
    while (true) {
      try {
        sleep(5);
      } catch (InterruptedException ex) {
        System.out.println("Interrupted Exception");
      }
      if (numberOfActiveEnemy < MAX_NUMBER_OF_ACTIVE_ENEMY) {
        addActiveEnemy();
      }
      moveActiveEnemy();
      checkPlayerContact();
      checkActiveEnemy();
    }
  }
}
