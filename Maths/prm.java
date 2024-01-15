package JavaLearning;

import java.util.Scanner;

public class prm {
    public static void main(String[] args) {
        Scanner sc=  new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num =sc.nextInt();
        if (num <= 1) {
            System.out.print("not prime");
        }
        int c=2;
        while(c*c<=num)
        {
            if(num%c==0){
                break;
            }
            c++;
        }
        if(c*c>num) {
            System.out.print("prime");
        }
        else {
            System.out.print("not prime");
        }
    }
}
