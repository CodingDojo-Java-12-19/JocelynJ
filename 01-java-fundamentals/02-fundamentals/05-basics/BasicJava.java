import java.util.ArrayList;

public class BasicJava {
    public static void main(String[] args) {
        int[] myArr1 = {1,3,5,7,9,13};
        int[] myArr2 = {5, 100, 3, 50, 16};
        int[] myArr3 = {-4, 0, -5, -6};
        int[] myArr4 = {-20, -1, -5, -10};
        int[] array =  {1, 3, 5, 7};
        BasicJava.printAll(255);
        BasicJava.printOdd(255);
        BasicJava.printSum(255);
        BasicJava.iterateArray1(myArr1);
        BasicJava.iterateArray2(myArr1);
        System.out.println(BasicJava.findMax(myArr1));
        System.out.println(BasicJava.getAvg(array));
        System.out.println(BasicJava.oddArray(255));
        System.out.println(BasicJava.greaterThanY(array, 1));
        BasicJava.squaredArray(array);
        BasicJava.eliminateNegatives(myArr4);
        BasicJava.maxMinAverage(array);
    }

    public static void printAll(int num){
        for(int i = 1; i <= num; i++){
            System.out.println(i);
        }
    }

    public static void printOdd(int num){
        for(int i = 1; i <= num; i++){
            if(i % 2 != 0){
                System.out.println(i);
            }
        }
    }

    public static void printSum(int num){
        int sum = 0;
        for(int i = 1; i <= num; i++){
            sum += i;
            System.out.println("Number: " + i + " " + "Sum: " + sum);
        }
    }

    public static void iterateArray1(int[] arr1) {
        for(int i=0; i < arr1.length; i++){
            System.out.println(arr1[i]);
        }
    }

    public static void iterateArray2(int[] arr1) {
        for(int val: arr1){
            System.out.println(val);
        }
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

    public static int getAvg(int[] arr){
        int total = 0;
        for(int i = 0; i< arr.length; i++){
            total += arr[i];
        }
        return total/arr.length;
    }

    public static ArrayList<Integer> oddArray(int num) {
		ArrayList<Integer> vals = new ArrayList<Integer>();
		for(int i = 0; i <= num; i++) {
			if(i % 2 != 0)
				vals.add(i);
		}
		return vals;
    }
    
    public static int greaterThanY(int[] arr, int y){
        int count = 0;
        for(int val: arr){
            if(val > y){
                count++;
            }
        }
        return count;
    }

    public static void squaredArray(int[] vals) {
		for(int i = 0; i < vals.length; i++) {
            vals[i] = vals[i] * vals[i];
            System.out.println(vals[i]);
        }
    }
    
	public static void eliminateNegatives(int[] nums) {
		for(int i = 0; i < nums.length; i++) {
			if(nums[i] < 0)
                nums[i] = 0;
            System.out.println(nums[i]);
        }
    }
    
	public static void maxMinAverage(int[] nums) {
		int min = findMin(nums);
		int max = findMax(nums);
		double avg = getAvg(nums);
		System.out.println(String.format("Max: %d, Min: %d, Average: %f", max, min, avg));
	}
}
