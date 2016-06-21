package test;

import junit.framework.TestCase;
import main.Choice;
import main.Paper;
import main.Rock;
import main.Scissors;

public class TestRock extends TestCase {
	public void testPaperBeatsRock() {
		Rock rock = new Rock();
		Choice paper = new Paper();

		assertTrue(paper.beats(rock) > 0);
		assertFalse(rock.beats(paper) > 0);
	}

	public void testRockBeatsScissors() {
		Rock rock = new Rock();
		Scissors scissors = new Scissors();

		assertTrue(rock.beats(scissors) > 0);
		assertFalse(scissors.beats(rock) > 0);
	}

	public void testRockTiesRock() {
		Rock rock = new Rock();
		Rock otherRock = new Rock();

		assertTrue(rock.beats(otherRock) == 0);
		assertTrue(otherRock.beats(rock) == 0);
	}
}
