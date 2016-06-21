package main;

public class Scissors extends Choice {
	public int beats(Rock rock) { return -1; }
	public int beats(Choice paper) { return 1; }
	public int beats(Scissors scissors) { return 0; }
}
