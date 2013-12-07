package jobs;
import classes.Character;

public class Miner extends Jobs{
	public Miner(Character c) {
		// TODO Auto-generated constructor stub
		character = c;
	}
	@Override
	public String state() {
		// TODO Auto-generated method stub
		return character.state() + " miner";
	}
}
