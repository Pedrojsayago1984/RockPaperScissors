package test;

import junit.framework.TestCase;
import main.Choice;
import main.Paper;
import main.Player;
import main.Rock;
import main.Scissors;

public class TestPlayer extends TestCase {
	
	public void testThrowRock() {
		Player player = new Player();
		Choice rock;
		try {
			rock = player.throwChoice("Rock");
			assertTrue(rock instanceof Rock);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void testThrowPaper() {
		Player player = new Player();
		Choice paper;
		try {
			paper = player.throwChoice("Paper");
			assertTrue(paper instanceof Paper);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void testThrowScissors() {
		Player player = new Player();
		Choice scissors;
		try {
			scissors = player.throwChoice("Scissors");
			assertTrue(scissors instanceof Scissors);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
