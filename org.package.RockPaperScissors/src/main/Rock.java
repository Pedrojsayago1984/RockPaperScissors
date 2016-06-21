package main;

public class Rock extends Choice {
	public int beats(Choice paper) { return -1; }
	public int beats(Scissors scissors) { return 1; }
	public int beats(Rock rock) { return 0; }
}
