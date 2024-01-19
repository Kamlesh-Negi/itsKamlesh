package JavaLearning.arrays.multidimensionArray;

import java.util.Arrays;
import java.util.Scanner;

public class MultiDimension {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] arr = new int[3][3];
       /* int[][] arr2D = {
                {1, 2, 3},      // 0th index
                {4, 5},         // 1st index
                {6, 7 ,8, 9}    // 2nd index -> arr2D[2] = {6, 7, 8, 9}
                };
*/
        System.out.println(arr.length);   // will give no. of rows
        for (int row = 0; row < arr.length; row++) {
            // for each col in every row
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = in.nextInt();
            }
        }

// Print output  (1st method)

     /*      for (int row = 0; row < arr.length; row++) {
            // for each col in every row
                for(int col = 0; col < arr[row].length; col++){
                    System.out.print(arr[row][col]+" ");
                }
                System.out.println();       // for a new line after every row
    */

        // 2nd Method to print

 /*  for (int row = 0; row < arr.length; row++) {

            // another way of printing array
            System.out.println(Arrays.toString(arr[row]));
        }
 */

  // 3rd Method- enhanced for loop
   for (int[] a : arr)     // in this case the data-type of elements of the array is an array itself therefore int[]
   {
       System.out.println(Arrays.toString(a));
   }
   System.out.println();       // for a new line after every row

    }
}

