
public class HumanTest {

	public static void main(String[] args) {
		Ninja ninja = new Ninja();
		Samurai samurai = new Samurai();
		Samurai samurai2 = new Samurai();
		Wizard wizard = new Wizard();
		
		ninja.steal(wizard);
		ninja.runAway();
		
		wizard.heal(ninja);
		wizard.fireball(samurai);
		
		samurai.deathBlow(wizard);
		samurai.meditate();
		samurai.howMany();
	}

}