package RockPaperScissors;

public class Cougar extends Opponents {

	public Cougar() {
	}

	public Cougar(String name, String opponent) {
		super(name, opponent);
	}

	public void chooseYourWeapon(int userInput) {

		if (userInput == 0) {
			System.out.println("Opponent Cougar chooses Paper. YOU LOSE!");
		} else if (userInput == 1) {
			System.out.println("Opponent Cougar chooses Scissors. YOU LOSE!");
		} else if (userInput == 2) {
			System.out.println("Opponent Cougar chooses Rock. YOU LOSE!");
		} else {
			System.out.println("You're trying to cheat!");
		}
	}
}