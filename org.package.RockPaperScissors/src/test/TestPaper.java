package test;

import junit.framework.TestCase;
import main.Paper;
import main.Rock;
import main.Scissors;

public class TestPaper extends TestCase{
	public void testPaperBeatsRock() {
		Rock rock = new Rock();
		Paper paper = new Paper();
		
		assertTrue(paper.beats(rock)>0);
		assertFalse(rock.beats(paper)>0);
	}
	
 	public void testScissorsBeatsPaper() {
 		Paper paper = new Paper();
		Scissors scissors = new Scissors();
		
		assertTrue(scissors.beats(paper)>0);
		assertFalse(paper.beats(scissors)>0);
	}
 	
 	public void testPaperTiesPaper() {
 		Paper paper = new Paper();
 		Paper otherPaper = new Paper();
		
		assertTrue(paper.beats(otherPaper)==0);
		assertTrue(otherPaper.beats(paper)==0);
	}
}
