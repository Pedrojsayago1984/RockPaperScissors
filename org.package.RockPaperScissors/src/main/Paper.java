package main;

public class Paper extends Choice {
	public int beats(Scissors scissors) { return -1; }
	public int beats(Rock rock) { return 1; }
	public int beats(Paper paper) { return 0; }
}
