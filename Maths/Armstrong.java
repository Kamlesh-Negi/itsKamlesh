package JavaLearning;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number: ");
        int input = sc.nextInt();
        int num = input;
        int result = 0;
        int n = String.valueOf(num).length();
        while(num !=0)
        {
            int rem = num % 10;
            num = num/10;
            result = (int) (result + Math.pow(rem , n));
        }
            if (result == input){
                System.out.println("Armstrong");
            }
            else System.out.println("Armstrong" );
    }

}
