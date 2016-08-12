package RockPaperScissors;

import java.util.Random;

public class Melloncamp extends Opponents {
	Random rnd = new Random();
	int randomNumber = rnd.nextInt(3);

	public Melloncamp() {
	}

	public Melloncamp(String name, String opponent) {
		super(name, opponent);
	}

	public void chooseYourWeapon(int userInput) {
		if (randomNumber == userInput) {
			System.out.println("You both chose the same thing! It's a tie.");
		} else if (randomNumber == 0) {
			if (userInput == 1) {
				System.out.println("Opponent Melloncamp chooses Rock. YOU WIN!");
			} else if (userInput == 2) {
				System.out.println("Opponent Melloncamp chooses Rock. YOU LOSE!");
			}
		} else if (randomNumber == 1) {
			if (userInput == 0) {
				System.out.println("Opponent Melloncamp chooses Paper. YOU LOSE!");
			} else {
				System.out.println("Opponent Melloncamp chooses Paper. YOU WIN!");
			}

		} else {
			if (userInput == 0) {
				System.out.println("Opponent Melloncamp chooses Scissors. YOU WIN!");
			} else {
				System.out.println("Opponent Melloncamp chooses Scissors. YOU LOSE!");

			}

		}
		randomNumber = rnd.nextInt(3);
	}

}
