
public class Wizard extends Human {
	public Wizard() {
		this.health = 50;
		this.intelligence = 8;
	}
	
	public void heal(Human target) {
		target.intelligence += this.intelligence;
		System.out.println("Wizard healed " + target.toString() + ". Target's intelligence is now " + target.intelligence);
	}
	
	public void fireball(Human target) {
		target.health -= this.intelligence;
		System.out.println("Wizard shot fireball at " + target.toString() + " and their health is now " + target.health);
	}
}