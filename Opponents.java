package RockPaperScissors;

public class Opponents extends AbstractClass {

	String opponent = null;

	public Opponents(String name, String opponent) {
		super(opponent);
		this.opponent = opponent;
	}

	public Opponents() {
	}

	public String getOpponent() {
		return opponent;
	}

	public void setOpponent(String opponent) {
		this.opponent = opponent;
	}

	@Override
	public int chooseYourWeapon() {
		return 0;
		// TODO Auto-generated method stub

	}

}
