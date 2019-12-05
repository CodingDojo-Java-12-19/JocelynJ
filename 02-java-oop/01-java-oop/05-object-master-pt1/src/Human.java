
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
		System.out.println("Strength: " + this.strength);
		System.out.println("Stealth: " + this.stealth);
		System.out.println("Intelligence: " + this.intelligence);
		System.out.println("Health: " + this.health);
	}
	
	public void attack() {
		health -= strength;
		System.out.println("You were attacked! Your current strength is " + health);
	}
}