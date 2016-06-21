package test;

import java.util.Random;

import main.Choice;
import main.Paper;
import main.Player;
import main.Rock;
import main.Scissors;

public class PlayGameTest {
	static int countPlayer1 = 0;
	static int countPlayer2 = 0;

	public static void main(String[] args) throws Exception {
		for(int i=0; i<100; i++) {
			playGame();
		}
		System.out.println("The number of games Player 1 has won is " + countPlayer1 + 
				", the number of times Player 2 has won is " + countPlayer2 +
				", the number of times both players drew were " + (100-countPlayer1-countPlayer2));
    }
	
	private static void playGame() throws Exception {
		Player player1 = new Player();
		Player player2 = new Player();
		Choice player1Choice;
		Choice player2Choice = null;
		Random r = new Random();
		
	    //Player 2 always plays randomly
		switch(r.nextInt(3)){
	        case 0: player2Choice = player2.throwChoice("Rock");
	        break;
	        case 1: player2Choice = player2.throwChoice("Paper");
	        break;
	        case 2: player2Choice = player2.throwChoice("Scissors");
	    }
		
		//Player 1 always chooses Rock
		player1Choice = player1.throwChoice("Rock");
		compareChoices(player1Choice, player2Choice);
	}

	private static void compareChoices(Choice player1Choice, Choice player2Choice) {
		int result;
		if(player2Choice instanceof Scissors) {
			result = player1Choice.beats((Scissors) player2Choice);
			countPlayer1++;
		} else if (player2Choice instanceof Rock) {
			result = player1Choice.beats((Rock) player2Choice);
		} else {
			result = player1Choice.beats((Paper) player2Choice);
			countPlayer2++;
		}
	}
}
