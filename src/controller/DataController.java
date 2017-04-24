/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import model.GameState;

/**
 * Controller untuk model GameState.
 * @author adyanaufalF
 */
public class DataController extends Thread{
  /*Model untuk player*/
  private GameState gameStateModel;
  /*Tampilan score*/
  private JLabel scoreView;
  /*Tampilan high score*/
  private JLabel highScoreView;
  /*Tampilan Level*/
  private JLabel levelView;
  
  public DataController(JLabel score, JLabel highScore, JLabel level) 
          throws FileNotFoundException {
    this.scoreView = score;
    this.highScoreView = highScore;
    this.levelView = level;
    gameStateModel = new GameState();
  }
  
  @Override
  public void run() {
    long startTime = System.nanoTime();
    while (true) {
      try {
        sleep(100-gameStateModel.getLevel()*3);
      } catch (InterruptedException ex) {
        System.out.println("InterruptedException");
      }
      gameStateModel.setScore(gameStateModel.getScore()+1);
      scoreView.setText("Score : " + gameStateModel.getScore());
      if(gameStateModel.getScore()> gameStateModel.getHighScore()){
        gameStateModel.setHighScore(gameStateModel.getScore());
        try {
          gameStateModel.saveHighScore();
        } catch (FileNotFoundException ex) {
          System.out.println("FileNotFoundException");
        }
      }
      highScoreView.setText("High Score : " + gameStateModel.getHighScore());
      gameStateModel.setLevel((int)(((System.nanoTime()-startTime)
              /1500000000)/10));
      levelView.setText("Level : " + gameStateModel.getLevel());
    }
  }
  
}
