package JavaLearning.Searching;

import java.util.Arrays;

public class LinearSearchInString {
    public static void main(String[] args) {
        String name = "Kamlesh";
        char target = 'm';
       // System.out.println(searchString(name, target));

        System.out.println(searchString2(Arrays.toString(name.toCharArray()),target));
    }

    static boolean searchString2(String str, char target) {
        if (str.length() == 0) {
            return false;
        }

      // for each loop or enhanced for loop requires an array or collection to work upon
        for (char ch : str.toCharArray())   // to use for each loop we need to convert the string into a character Array
        {
            if (ch == target) {
                return true;
            }
        }
        return false;
    }
        static boolean searchString(String str, char target){
        if (str.isEmpty())
        {
            return false;
        }
        for (int i = 0; i < str.length(); i++){
            if (target == str.charAt(i)) {
                return true;
            }
        }
        return false;

    }
}
