package JavaLearning.Searching;

import java.util.Arrays;
import java.util.Scanner;

public class SearchInRange {
    public static void main(String[] args) {
        int[] nums = new int[10];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array elements ");
        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(nums));
        System.out.print("enter the starting range ");
        int start = sc.nextInt();
        System.out.print("enter the end range ");
        int end = sc.nextInt();
        System.out.print("enter the target ");

        int target = sc.nextInt();
        int ans = linearSearchInRange(nums, target,start,end);

        System.out.println(target+" is at index no. "+ans);

    }
    static int linearSearchInRange(int[] arr, int target, int start, int end)
    {
        if(arr.length == 0)
        {
            return -1;
        }
        for (int index = start; index <= end; index++) {
            int element = arr[index];
            if(element == target)
            {
                return index;
            }

        }
        return -1;
    }
}
