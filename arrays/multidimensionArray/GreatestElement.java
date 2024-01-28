package JavaLearning.arrays.multidimensionArray;

import java.util.Arrays;
import java.util.Scanner;

public class GreatestElement {
    public static void main(String[] args) {
        System.out.println("Enter the elements of first array ");
        int[][] arr= inputArr();
        int large = Greatest(arr);
        System.out.print("Greatest element in array : "+large);

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
        for (int[] ints : arr) {
            System.out.println(Arrays.toString(ints));
        }
        return arr;
    }
    private static int Greatest(int[][] arr){
        int large = arr[0][0];
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if(arr[row][col] >= large)
                {
                    large = arr[row][col];
                }
            }
        }
        return large;
    }
}
