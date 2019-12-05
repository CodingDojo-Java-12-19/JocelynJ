
public class GorillaTest {

	public static void main(String[] args) {
		// instantiate a gorilla and have it throw three things, eat bananas twice, and climb once.
		Gorilla coco = new Gorilla();
		coco.throwSomething("teddy bear");
		coco.throwSomething("shoe");
		coco.throwSomething("banana");
		coco.eatFood("cookie");
		coco.eatFood("banana");
		coco.climb();
		System.out.println("Current energy level: " + coco.energyLevel);
	}

}
