
public class Samurai extends Human {
	private static int numSamurai = 0;
	
	public Samurai() {
		this.health = 200;
		numSamurai += 1;
	}
	
	public void deathBlow(Human target) {
		target.health = 0;
		this.health = this.health/2;
		System.out.println("Samurai killed " + target.toString() + " Target's health is now " + target.health + " and Samurai's health is " + this.health);
	}
	
	public void meditate() {
		this.health += this.health/2;
		System.out.println("Samurai meditates to restore their health a bit, their health is now " + this.health);
	}
	
	public int howMany() {
		System.out.println("There are " + numSamurai + " samurai currently.");
		return numSamurai;
	}
}