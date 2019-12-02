import java.util.ArrayList;
import java.util.Collections;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class PuzzleJava {
    public ArrayList<Integer> arrSumAndGreaterThanY(int[] arr, int y){
        int sum = 0;
        ArrayList<Integer> greaterThanY = new ArrayList<Integer>();
        for(int val: arr){
            sum += val;
            if(val > y){
                greaterThanY.add(val);
            }
        }
        System.out.println(sum);
        return greaterThanY;
    }

    public ArrayList<String> shuffleAndLongerThanX(ArrayList<String> arr, int x){
        ArrayList<String> namesGreaterThanX = new ArrayList<String>();
        Collections.shuffle(arr);
        System.out.println(arr);
        for(String name: arr){
            if(name.length() > x){
                namesGreaterThanX.add(name);
            }
        }
        return namesGreaterThanX;
    }

    public static Character[] alpha = {
        'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};

    public void shuffleAlpha(){
		List<Character> alphaList = Arrays.asList(alpha);
		Collections.shuffle(alphaList);
		alphaList.toArray(alpha);
		System.out.println(Arrays.toString(alpha));

        System.out.println(alpha[25]);
        System.out.println(alpha[0]);
        if(alpha[0] == 'a' || alpha[0] == 'e' || alpha[0] == 'i' || alpha[0] == 'o' || alpha[0] == 'u' ){
            System.out.println("The first leter is a vowel!");
        }
    }
    
    public int[] randomInts(int max, int min){
        Random rand = new Random();
        int[] randoms = new int[10];
        for(int i = 0; i < randoms.length; i++){
            randoms[i] = rand.nextInt((max-min) + 1) + min; 
        }
        return randoms;
    }

    public static int findMax(int[] arr){
        int max = arr[0];
        for(int i = 1; i < arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }

    public static int findMin(int[] arr){
        int min = arr[0];
        for(int i = 1; i < arr.length; i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        return min;
    }

    public int[] minMaxSortedArr(){
        int[] randomNums = randomInts(100,55);
        Arrays.sort(randomNums);
        int max = findMax(randomNums);
        int min = findMin(randomNums);
        System.out.println(max);
        System.out.println(min);
        return randomNums;
    }

    public String randomString(){
        String randoString = "";
        Random rand = new Random();
        for(int i = 0; i < 5; i++){
            int randoInt = rand.nextInt(26-1);
            randoString += alpha[randoInt];
        }
        return randoString;
    }

    public void randomStringArr(){
        String[] randoStrings = new String[10];
        for(int i = 0; i < 10; i++){
            randoStrings[i] = randomString();
        }
        System.out.println(Arrays.toString(randoStrings));
    }
}