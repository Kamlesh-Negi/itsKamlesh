package JavaLearning.Maths;

import java.util.Arrays;
import java.util.Scanner;

public class BinaryEquivalent {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number: ");
        int num = sc.nextInt();

        if(num>0)
        {
            int tempNum = num;
            int digits = 0;
            while(tempNum > 0){
                tempNum = tempNum / 2;
                digits++;
            }

   int[] arr = new int[digits];
            int count = 0;
        while (num > 0){
            int rem = num % 2;
            arr[count] = rem;
            num = num / 2;
            count++;
            }
            for (int i = count-1; i >= 0 ; i--) {
                System.out.print(arr[i]);
            }
        }
        else{
            System.out.println("enter a positive number");
        }
    }
}
