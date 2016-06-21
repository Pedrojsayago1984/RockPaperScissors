package main;

public class Player {
	public Choice throwChoice(String gestureName) throws Exception {
		if("Rock".equals(gestureName)) {
			return new Rock();
		}
		else if("Paper".equals(gestureName)) {
			return new Paper();
		}
		else if("Scissors".equals(gestureName)) {
			return new Scissors();
		}
		else {
			throw new Exception("Not a valid choice name");
		}
	}
}
