package com.learnspringbatch2.learnspringbatch2.game;

public class GameRunner {
	private GammingConsole game;
	
	public GameRunner(GammingConsole game) {
		this.game = game;
	}
     
     public void run() {
    	 System.out.println("This is PubgGame  game");
    	 game.left();
    	 game.right();
    	 game.up();
    	 game.down();
    	 game.center();
     }

}
