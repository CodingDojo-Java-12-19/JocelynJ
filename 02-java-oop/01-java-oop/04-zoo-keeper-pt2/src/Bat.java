
public class Bat {
	int energyLevel = 300;
	
	public void fly() {
		System.out.println("Flap, flap, flap, flap...and the bat takes off flying.");
		energyLevel -= 50;
	}
	
	public void eatHumans() {
		System.out.println("Eating a tasty human right now.");
		energyLevel += 25;
	}
	
	public void attackTown() {
		System.out.println("...and the town bursts into flames...");
		energyLevel -= 100;
	}
}
