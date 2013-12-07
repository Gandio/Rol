package classes;
import weapons.HandsBehavior;
import weapons.WeaponBehavior;


public class King extends Character{
	public King() {
		// TODO Auto-generated constructor stub
		super(new HandsBehavior());
	}
	
	public King(WeaponBehavior w){
		super(w);
	}
	
	@Override
	public String state() {
		// TODO Auto-generated method stub
		return "I'm a king";
	}
}
