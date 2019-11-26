public class FizzBuzz {
    String fizzy = "";
    public String fizzbuzz(int num) {
        for(int i = 1; i < num; i++){
            if(i % 15 == 0){
                fizzy += "FizzBuzz\n";
            }else if (i % 3 == 0){
                fizzy += "Fizz\n";
            }else if (i % 5 == 0){
                fizzy += "Buzz\n";
            }else {
                String j =  Integer.toString(i);
                fizzy += j + "\n";
            }
        } return fizzy;
    }
}
