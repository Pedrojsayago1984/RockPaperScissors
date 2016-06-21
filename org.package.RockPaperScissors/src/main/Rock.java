package main;

public class Rock {
	public int beats(Paper paper) { return -1; }
	public int beats(Scissors scissors) { return 1; }
	public int beats(Rock rock) { return 0; }
}
