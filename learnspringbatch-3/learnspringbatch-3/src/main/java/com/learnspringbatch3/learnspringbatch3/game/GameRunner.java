package com.learnspringbatch3.learnspringbatch3.game;


public class GameRunner {
    GameStart game;
    
    public GameRunner(GameStart game){
   	  this.game = game;
   	  
     }
    
    public void run() {
   	 System.out.println("This is Mario  game");
   	 game.left();
   	 game.right();
   	 game.up();
   	 game.down();
    }
}
