package classes;
import weapons.HandsBehavior;
import weapons.WeaponBehavior;


public class Knight extends Character{
	public Knight() {
		super(new HandsBehavior());
		// TODO Auto-generated constructor stub
		
	}
	public Knight(WeaponBehavior w) {
		super(w);
		// TODO Auto-generated constructor stub
	}
	@Override
	public String state() {
		// TODO Auto-generated method stub
		return "I'm a knight";
	}
}
