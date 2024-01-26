package JavaLearning.arrays.multidimensionArray;

import java.util.Arrays;
import java.util.Scanner;

public class Arr2DSum {
    public static void main(String[] args) {
        System.out.println("Enter the elements of first array ");
        int[][] arr1 = inputArr();
        System.out.println("Enter the elements of second array ");
        int[][] arr2 = inputArr();

        int[][] arrSum = addArrays(arr1, arr2);

        System.out.println("Sum of arrays:");
        printArray(arrSum);
    }

    public static int[][] inputArr() {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[3][3];
       // enter the array elements
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = sc.nextInt();
            }
        }
        // print array
        for (int row = 0; row < arr.length; row++) {
            System.out.println(Arrays.toString(arr[row]));
        }
        return arr;
    }

    public static int[][] addArrays(int[][] arr1, int[][] arr2) {
        int[][] result = new int[arr1.length][arr1[0].length];
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                result[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        return result;
    }

    public static void printArray(int[][] arr) {
        for (int[] row : arr) {
            System.out.println(Arrays.toString(row));
        }
    }
}
