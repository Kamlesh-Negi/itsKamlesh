package JavaLearning.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrStringModify {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] str= new String[4];
      // get input from user
        for (int i = 0; i < str.length; i++) {
            str[i] = sc.next();
      }
        // print
        System.out.println(Arrays.toString(str));

        // modifying String
        System.out.println("enter the index you want to modify ");
        int indexToModify= sc.nextInt();
        if (indexToModify >= 0 && indexToModify < str.length) {
                System.out.println("enter the string you want: ");
                String str2 = sc.next();
                str[indexToModify] = str2;

            }
        else {
              System.out.println("invalid index");
          }
        // Print the modified String
        System.out.println(Arrays.toString(str));


    }
}
