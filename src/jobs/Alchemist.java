package jobs;
import classes.Character;

public class Alchemist extends Jobs{
	public Alchemist(Character c) {
		// TODO Auto-generated constructor stub
		character = c;
	}
	@Override
	public String state() {
		// TODO Auto-generated method stub
		return character.state() + " alchemist";
	}
}
