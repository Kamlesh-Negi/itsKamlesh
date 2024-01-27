package JavaLearning.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class RunningSumArray1D {
    public static int[] runningSum(int[] nums)
    {

        int[] results = new int[nums.length];
        results[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            results[i] = nums[i] + results[i-1];
        }
        return results;
    }

    public static void main(String[] args) {
        // Example usage:
       // int[] inputArray = {1, 2, 3, 4, 5};
// input from user
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the array");
        int len = sc.nextInt();
        System.out.println("Enter the array elements ");
        int[] inputArray = new int[len];

        for (int i = 0; i < len; i++) {
            System.out.print("element "+(i+1)+": ");
            inputArray[i] = sc.nextInt();
        }

        // Calculate running sum
        int[] runningSumArray = runningSum(inputArray);

        // Print the original and running sum arrays
        System.out.println("Original Array: " + Arrays.toString(inputArray));
        System.out.println("Running Sum Array: " + Arrays.toString(runningSumArray));
    }
}
