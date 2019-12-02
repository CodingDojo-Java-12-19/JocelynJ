import java.util.ArrayList;

public class PuzzleJavaTest {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};
        ArrayList<String> array1 = new ArrayList<String>();
        array1.add("Nancy");
        array1.add("Jinichi");
        array1.add("Fujibayashi");
        array1.add("Momochi");
        array1.add("Ishikawa");

        PuzzleJava pJ = new PuzzleJava();
        System.out.println(pJ.arrSumAndGreaterThanY(array, 3));
        System.out.println(pJ.shuffleAndLongerThanX(array1, 5));
        pJ.shuffleAlpha();  
        pJ.randomInts(100, 55);
        pJ.minMaxSortedArr();
        System.out.println(pJ.randomString());
        pJ.randomStringArr();
    }
}