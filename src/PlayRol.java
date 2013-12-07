import jobs.Alchemist;
import jobs.Artisan;
import weapons.*;
import classes.Character;
import classes.*;

public class PlayRol {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Character c1 = new King();
		Character c2 = new Queen(new BowAndArrowBehavior());
		Character c3 = new Troll(new AxeBehavior());
		Character c4 = new Knight();
		
		System.out.println(c1.state());
		c1.fight();
		c1 = new Artisan(c1);
		c1 = new Alchemist(c1);
		System.out.println(c1.state());
		
		System.out.println("-------------------------");
		
		System.out.println(c2.state());
		c2.fight();
		c2.changeWeapon(new KnifeBehavior());
		c2.fight();
		
		System.out.println("-------------------------");
		
		System.out.println(c3.state());
		c3.fight();
		
		System.out.println("-------------------------");
		
		System.out.println(c4.state());
		c4.fight();
		c4.changeWeapon(new SwordBehavior());
		c4.fight();
		
	}

}
