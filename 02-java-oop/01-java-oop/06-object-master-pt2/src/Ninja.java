
public class Ninja extends Human {	
	public Ninja() {
		this.stealth = 10;
	}
	
	public void steal(Human target) {
		target.stealth -= this.stealth;
		System.out.println("Stole " + this.stealth + " stealth from " + target.toString() + ", he is now left with " + target.stealth + " stealth");
	}
	
	public void runAway() {
		this.health -= 10;
		System.out.println("Ninja ran away and lost 10 stealth.");
	}
}