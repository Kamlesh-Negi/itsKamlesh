package JavaLearning.arrays.multidimensionArray;

import java.util.Arrays;
import java.util.Scanner;

public class SumForwardDiagonal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[3][3];
        System.out.println("Enter the array elements");
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = sc.nextInt();
            }
        }
// print array
        for (int[] num : arr) {
            System.out.println(Arrays.toString(num));
        }
       // forward diagonal sum
        int DiagonalSum = 0;
        for (int row = 0; row < arr.length; row++) {
           
            for (int col = 0; col < arr[row].length; col++) {
                    if (row == col) {
                        DiagonalSum = DiagonalSum + arr[row][col];
                    }
                }
        }
        System.out.println("Diagonal Sum = "+DiagonalSum);
    }
}
