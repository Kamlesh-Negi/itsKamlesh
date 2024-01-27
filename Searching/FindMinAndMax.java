package JavaLearning.Searching;

import java.util.Arrays;
import java.util.Scanner;

public class FindMinAndMax {
    public static void main(String[] args) {
        int[] nums = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array elements ");
        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(nums));

        int max = findMax(nums);
        System.out.println("largest element "+max);

        int min = findMin(nums);
        System.out.println("smallest element "+min);

    }

    // finding the largest element in the array
        static int findMax(int[] arr)
    {
        int element = arr[0];
       for (int index = 1; index < arr.length; index++) {
            if (arr[index] >= element) {
                element = arr[index];
            }
       }
       return element;
    }
    // finding the smallest element in the array
    static int findMin(int[] arr)
    {
        int element = arr[0];
       for (int index = 1; index < arr.length; index++) {
            if (arr[index] <= element) {
                element = arr[index];
            }
       }
       return element;
    }
}

