package jobs;
import classes.Character;
public class Cook extends Jobs{
	public Cook(Character c) {
		// TODO Auto-generated constructor stub
		character = c;
	}
	@Override
	public String state() {
		// TODO Auto-generated method stub
		return character.state() +  " cook";
	}

}
