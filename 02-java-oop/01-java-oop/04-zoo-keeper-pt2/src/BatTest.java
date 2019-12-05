
public class BatTest {

	public static void main(String[] args) {
		Bat monsterBat = new Bat();
		monsterBat.attackTown();
		monsterBat.attackTown();
		monsterBat.attackTown();
		monsterBat.eatHumans();
		monsterBat.eatHumans();
		monsterBat.fly();
		monsterBat.fly();
		System.out.println("Energy level remaining: " + monsterBat.energyLevel);
	}

}
