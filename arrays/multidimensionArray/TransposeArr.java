package JavaLearning.arrays.multidimensionArray;

import java.util.Arrays;
import java.util.Scanner;

public class TransposeArr {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[3][3];
        System.out.println("enter the array elements ");
        for (int row = 0; row < arr.length; row++) {
            for(int col = 0; col < arr[row].length; col++)
            {
                arr[row][col] = sc.nextInt();
            }
        }
       // print array
       for (int row = 0; row < arr.length; row++)
       {
           System.out.println(Arrays.toString(arr[row]));
       }

       // transpose the matrix
        System.out.println("Transpose of the matrix ");
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                System.out.print(arr[col][row]+" ");
            }
            System.out.println();
        }
    }
}
