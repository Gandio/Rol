package classes;
import weapons.HandsBehavior;
import weapons.WeaponBehavior;

public abstract class Character {
	private WeaponBehavior weapon;
	
	public Character(){
		weapon = new HandsBehavior();
	}
	
	public Character(WeaponBehavior w) {
		// TODO Auto-generated constructor stub
		weapon = w;
	}
	
	public void fight(){
		weapon.useWeapon();
	}
	
	public void changeWeapon(WeaponBehavior w){
		weapon = w;
	}
	
	public abstract String state();
}
