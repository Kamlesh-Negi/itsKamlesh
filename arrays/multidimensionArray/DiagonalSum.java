package JavaLearning.arrays.multidimensionArray;

import java.util.Arrays;
import java.util.Scanner;

public class DiagonalSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[3][3];
        System.out.println("enter the array elements ");
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = sc.nextInt();
            }
        }
        //print array
        for (int[] num: arr)
        {
            System.out.println(Arrays.toString(num));
        }

        // Forward Diagonal Sum

        int FwdDiagonalSum = 0;
        for (int row = 0; row < arr.length; row++) {
            FwdDiagonalSum = FwdDiagonalSum + arr[row][row];        //as both row and column indices should be same
        }
        System.out.println("Forward Diagonal Sum = "+FwdDiagonalSum);

        //  Backward Diagonal Sum

        int BwdDiagonalSum = 0;
        for (int row = 0; row < arr.length; row++)
        {
            BwdDiagonalSum = BwdDiagonalSum + arr[row][arr.length-row-1];
        }
        System.out.println("Backward Diagonal Sum = "+BwdDiagonalSum);
    }
}
