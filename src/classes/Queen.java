package classes;
import weapons.HandsBehavior;
import weapons.WeaponBehavior;


public class Queen extends Character{
	public Queen() {
		// TODO Auto-generated constructor stub
		super(new HandsBehavior());
	}
	
	public Queen(WeaponBehavior w){
		super(w);
	}
	
	@Override
	public String state() {
		// TODO Auto-generated method stub
		return "I'm a queen";
	}
}
