package main;

public class Choice {

	public Choice() {
		super();
	}

	public int beats(Scissors scissors) { return -1; }

	public int beats(Rock rock) { return 1; }

	public int beats(Paper paper) { return 0; }

}