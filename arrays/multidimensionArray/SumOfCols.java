package JavaLearning.arrays.multidimensionArray;

import java.util.Arrays;
import java.util.Scanner;

public class SumOfCols {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[4][3];
        System.out.println("Enter the array elements ");
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = sc.nextInt();
            }
        }

        // print array

        for (int row = 0; row < arr.length; row++) {
            System.out.println(Arrays.toString(arr[row]));

        }
    // column sum
        for (int row = 0; row < arr[row].length; row++)
        {
           int sum = 0;
            for (int col = 0; col < arr.length; col++) {

               sum = sum + arr[col][row];

            }
            System.out.println("sum of  col = "+ sum);
        }
    }
}
