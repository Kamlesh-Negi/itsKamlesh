package JavaLearning;

import java.util.Scanner;

public class num_to_Word {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int num = sc.nextInt();
        String numberStr = "" + num;
        // remove minus before the number
        //numberStr = numberStr.substring(1);
        System.out.println("Number to word of "+num+" is "+numberStr);

    }


}
