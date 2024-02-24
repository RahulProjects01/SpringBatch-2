package com.learnspringbatch3.learnspringbatch3;

import com.learnspringbatch3.learnspringbatch3.game.GameRunner;
import com.learnspringbatch3.learnspringbatch3.game.GameStart;

public class MarioGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       var GameRunner = new GameRunner();
       var GameStart = new GameStart(GameRunner);
       GameStart.run();
	}

}
