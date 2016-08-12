package RockPaperScissors;

import java.util.Scanner;

public class Roshambo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		User challenger = new User();
		John opponent1 = new John();
		Cougar opponent2 = new Cougar();
		Melloncamp opponent3 = new Melloncamp();
		boolean tryAgain = false;
		boolean keepPlaying = true;
		int userThrow = 0;

		System.out.println("Are you ready to Roshambo?");
		System.out.println("What's your name?");
		String name = sc.nextLine();

		do {
			
			System.out.println("Choose your opponent: John, Cougar or Melloncamp or Quit to exit");

			do {
				String battle = sc.nextLine();

				tryAgain = wrong(battle);

				switch (battle.toLowerCase()) {
				case "john":
					userThrow = challenger.chooseYourWeapon();
					opponent1.chooseYourWeapon(userThrow);
					break;
				case "cougar":
					userThrow = challenger.chooseYourWeapon();
					opponent2.chooseYourWeapon(userThrow);
					break;
				case "melloncamp":
					userThrow = challenger.chooseYourWeapon();
					opponent3.chooseYourWeapon(userThrow);
					break;
				case "quit":
					System.out.println("Thanks for playing!");
					System.exit(0);
				default:
					System.out.println("Incorrect entry. Please type in the name of your opponent to begin.");
				}
			} while (tryAgain);
		} while (keepPlaying);
	}

	private static boolean wrong(String battle) {
		if (battle.equals("john") || battle.equals("cougar") || battle.equals("melloncamp")) {
			return false;
		} else {
			return true;
		}
	}

}
