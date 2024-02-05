package JavaLearning.Searching;

import java.util.Arrays;
import java.util.Scanner;

public class Search2D {
    public static void main(String[] args){
        /* int[][] arr = {  {5,9,7},
                         {12,3,8},
                         {4,2,6} };
        int target = 4; */

        Scanner sc = new Scanner(System.in);
        System.out.print("no. of rows: ");
        int row = sc.nextInt();
        System.out.print("no. of col: ");
        int col = sc.nextInt();
        int[][] arr = new int[row][col];
        System.out.println("Enter the array elements");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        // print array

        for (int i = 0; i < row; i++){
            System.out.println(Arrays.toString(arr[i]));
        }

        System.out.print("enter target: ");
        int target = sc.nextInt();

        int[] indices = indices(arr, target);
        System.out.println(target+" is at indices "+ Arrays.toString(indices));
    }
    static int[] indices(int[][] arr, int target){
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if(arr[row][col] == target)
                {
                    return new int[]{row,col};
                }
            }
        }
        return  new int[]{-1,-1};
    }
}
