package RockPaperScissors;

public class John extends Opponents {

	public John() {
	}

	public John(String name, String opponent) {
		super(name, opponent);
	}

	public void chooseYourWeapon(int userInput) {

		if (userInput == 0) {
			System.out.println("Opponent John chooses Scissors. YOU WIN!");
		} else if (userInput == 1) {
			System.out.println("Opponent John chooses Rock. YOU WIN!");
		} else if (userInput == 2) {
			System.out.println("Opponent John Chooses Paper. YOU WIN!");
		} else {
			System.out.println("You tried to cheat!");
		}
	}
}
