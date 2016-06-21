package test;

import junit.framework.TestCase;
import main.Paper;
import main.Rock;
import main.Scissors;

public class TestScissors extends TestCase {
	public void testRockBeatsScissors() {
		Rock rock = new Rock();
		Scissors scissors = new Scissors();
		
		assertTrue(rock.beats(scissors)>0);
		assertFalse(scissors.beats(rock)>0);
	}
	
 	public void testScissorsBeatsPaper() {
 		Paper paper = new Paper();
		Scissors scissors = new Scissors();
		
		assertTrue(scissors.beats(paper)>0);
		assertFalse(paper.beats(scissors)>0);
	}
 	
 	public void testScissorsTiesScissors() {
 		Scissors scissors = new Scissors();
 		Scissors otherScissors = new Scissors();
		
		assertTrue(scissors.beats(otherScissors)==0);
		assertTrue(otherScissors.beats(scissors)==0);
	}
}
