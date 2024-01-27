package JavaLearning.Maths;

import java.util.Scanner;

public class CountDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n= sc.nextInt();
        System.out.print("Enter the digit to be counted: ");
        int digit = sc.nextInt();
        int count = 0;
        while(n>0){
            int rem = n % 10;
            if(rem == digit)
            {
                count++;
            }
            n = n/10;
        }
        System.out.println(count);

    }
}
