package RockPaperScissors;

import java.util.Scanner;

public class User extends AbstractClass {
	Scanner userInput = new Scanner(System.in);
	String play = null;
	boolean wrongAnswer = false;
	String name = null;
	int selection = 0;

	public User(String name, String name2) {
		super(name);
		name = name2;
	}

	public User() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int chooseYourWeapon() {
		do {
			System.out.println("Choose Rock(0), Paper(1), or Scissors(2)");
			play = userInput.nextLine();

			wrongAnswer = wrong(play);

			int choice = 9;
			if (wrongAnswer == false) {
				choice = Integer.parseInt(play);
			}

			switch (choice) {
			case 0:
				selection = 0;
				System.out.println("You chose Rock!");
				break;
			case 1:
				selection = 1;
				System.out.println("You chose Paper!");
				break;
			case 2:
				selection = 2;
				System.out.println("You chose Scissors!");
				break;
			default:
				System.out.println("Invalid entry. Please enter a 0, 1 or 2");
				break;
			}

		} while (wrongAnswer);
		return selection;

	}

	public static boolean wrong(String choice) {

		try {
			int aNumber = Integer.parseInt(choice);
			if (aNumber == 0 || aNumber == 1 || aNumber == 2) {
				return false;
			} else
				return true;
		} catch (NumberFormatException e) {
			return true;
		}

	}

	public int getSelection() {
		return selection;
	}

	public void setSelection(int selection) {
		this.selection = selection;
	}

}
