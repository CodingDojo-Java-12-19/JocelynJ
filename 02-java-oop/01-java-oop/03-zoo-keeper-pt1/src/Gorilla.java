
public class Gorilla extends Mammal {
	public void throwSomething(String thing) {
		System.out.println("The gorilla has thrown a " + thing + "!");
		energyLevel -= 5;
	}

	public void eatFood(String food) {
		System.out.println("The gorilla is eating a delicious " + food + ".");
		energyLevel += 10;
	}

	public void climb() {
		System.out.println("The gorilla is climbing a tree!");
		energyLevel -= 10;
	}
}
