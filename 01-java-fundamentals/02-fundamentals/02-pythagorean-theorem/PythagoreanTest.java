package java.pythagorean;
import java.pythagorean.Pythagorean;

public class PythagoreanTest {
    public static void main(String[] args) {
        Pythagorean pythag = new Pythagorean();
        double pythagResult = pythag.calculateHypotenuse(10, 20);
        System.out.println(pythagResult);
    }
}
