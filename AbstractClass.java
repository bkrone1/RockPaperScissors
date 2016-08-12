package RockPaperScissors;

public abstract class AbstractClass {

	String name = null;

	public AbstractClass(String name) {
		this.name = name;
	}

	public AbstractClass() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public abstract int chooseYourWeapon();

}
