package JavaLearning.arrays.multidimensionArray;
import java.util.Arrays;
import java.util.Scanner;
public class SumOfRows {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
 /*     int rows = sc.nextInt();
        int cols = sc.nextInt();
        System.out.print("No. of rows = "+rows+" and columns = "+cols)
*/
        int[][] arr = new int[4][3];
        System.out.println("Enter the array elements");
        for(int row = 0; row<arr.length; row++)
        {
            for (int col = 0; col<arr[row].length; col++) {
                arr[row][col] = sc.nextInt();
            }
        }
// Print Array
        for (int row = 0; row < arr.length; row++) {
            System.out.println(Arrays.toString(arr[row]));
        }

// Sum of Rows

        for (int row = 0; row < arr.length ; row++) {
            int sum = 0;
            for (int col = 0; col < arr[row].length; col++) {
                sum = sum + arr[row][col];
            }
            System.out.println("sum of "+row+" row = "+ sum);
        }

        }
}
