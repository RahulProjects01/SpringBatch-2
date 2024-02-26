package com.learnspringbatch2.learnspringbatch2;

import com.learnspringbatch2.learnspringbatch2.game.GameRunner;
import com.learnspringbatch2.learnspringbatch2.game.MarioGame;
import com.learnspringbatch2.learnspringbatch2.game.PackMan;
import com.learnspringbatch2.learnspringbatch2.game.PubgGame;
import com.learnspringbatch2.learnspringbatch2.game.SuperContra;

public class AppBasicGamming {

	public static void main(String[] args) 
	{
		
    var MarioGame = new MarioGame();
    var PubgGame = new PubgGame();
    var SuperContra = new SuperContra();
    var PackMan = new PackMan();
    var GameRunner = new GameRunner(SuperContra);
    GameRunner.run();
    
	}
}
