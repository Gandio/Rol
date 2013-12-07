package classes;
import weapons.HandsBehavior;
import weapons.WeaponBehavior;


public class Troll extends Character{
	public Troll() {
		// TODO Auto-generated constructor stub
		super(new HandsBehavior());
	}
	
	public Troll(WeaponBehavior w){
		super(w);
	}
	@Override
	public String state() {
		// TODO Auto-generated method stub
		return "I'm a troll (bad karma)";
	}
}
