package JavaLearning.arrays;

import java.util.Arrays;
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
/*        for(int i = 0; i<n; i++)
        {
            System.out.print(arr[i]+" ");
        }*/

        // enhanced for-loop

       /* for(int num : arr){
            System.out.print(num+" " );
        }*/

        System.out.println(Arrays.toString(arr));     // print the array in []

    }
}
