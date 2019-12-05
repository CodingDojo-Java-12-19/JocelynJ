
public class Human {
	protected int strength;
	protected int stealth;
	protected int intelligence;
	protected int health ;
	
	public Human(int strength, int stealth, int intelligence, int health) {
		this.strength = strength;
		this.stealth = stealth;
		this.intelligence = intelligence;
		this.health = health;
	}
	
	public Human() {
		this(3, 3, 3, 100);
	}
	
	public void attack(Human target) {
		target.health -= this.strength;
		System.out.println("You were attacked by " + target + "! Your current strength is " + target.health);
	}
}