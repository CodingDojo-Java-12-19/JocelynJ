import java.util.Random;

public class StringManipulator {
    public static String trimAndConcat(String str1, String str2) {
        String trimmedString = str1.trim().concat(str2.trim());
        return trimmedString;
    }
    
    public static Integer getIndexOrNull(String string, char letter){
        int stringIndex = string.indexOf(letter);
        if(stringIndex == -1){
            return null;
        } else {
            return stringIndex;
        }
    }

    public static Integer getIndexOrNull(String anotherString, String substring){
        int stringIndex = anotherString.indexOf(substring);
        if(stringIndex == -1){
            return null;
        }
        return stringIndex;
    }
    
    public static String concatSubstring(String str1, int num1, int num2, String str2){
        String newString = str1.substring(num1, num2);
        String result = newString.concat(str2);
        return result;
    }

}
