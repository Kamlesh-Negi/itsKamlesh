package arrays;

import java.util.Scanner;

public class ArrUserInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of array elements you want : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("enter the array elements: "+" ");

        for (int i = 0; i<n; i++ ){
            arr[i] = sc.nextInt();
        }
        System.out.print("Array elements are: ");
        for(int i = 0; i<n; i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
