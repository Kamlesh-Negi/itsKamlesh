package JavaLearning.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] str= new String[4];
      // get input from user
        for (int i = 0; i < str.length; i++) {
            str[i] = sc.next();
      }
        // print
        System.out.println(Arrays.toString(str));
    }
}
