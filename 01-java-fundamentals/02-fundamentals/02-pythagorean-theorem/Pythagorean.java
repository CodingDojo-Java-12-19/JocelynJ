package java.pythagorean;

import java.lang.Math;
//The declared package "" does not match the expected package "java.pythagorean". Explain VSCode's Quickfix options
//difference between java.util.Math and java.lang.Math

public class Pythagorean {
    public double calculateHypotenuse(int legA, int legB) {
        double legASquared = Math.pow(legA,2);
        double legBSquared = Math.pow(legB,2);

        double squareRoot = Math.sqrt(legASquared + legBSquared);

        return squareRoot;
    }
}