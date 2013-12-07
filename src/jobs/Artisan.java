package jobs;
import classes.Character;

public class Artisan extends Jobs{
	public Artisan(Character c) {
		// TODO Auto-generated constructor stub
		character = c;
	}
	@Override
	public String state() {
		// TODO Auto-generated method stub
		return character.state() + " artisan";
	}
}
