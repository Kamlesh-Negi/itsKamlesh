package JavaLearning.Searching;

import java.util.Scanner;

public class OrderedAgnosticBinarySearch {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the array length ");
        int len = sc.nextInt();
        int[] arr = new int[len];
        System.out.println("Enter the array elements ");
        for(int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("enter the target ");
        int target = sc.nextInt();
        int result = orderedAgnosticBS(arr, target);
        if (result != -1) {
            System.out.println(target + " is at index "+result);
        }else{
            System.out.println(target+" is not in the array" );
        }
    }
    static int orderedAgnosticBS(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;
        // find whether the array is Ascending or Descending

        boolean isAsc = arr[start] < arr[end];
        while(start <= end)
        {
            int mid = start + (end - start)/ 2;
            if(arr[mid] == target)
            {
                return mid;
            }
            if(isAsc){
                if(target < arr[mid]){
                    end = mid -1;
                }
                else {
                    start =mid + 1;
                }
            }

            // for descending order
            else {
                if(target > arr[mid]){
                    end = mid - 1;
                }
                else {
                    start =mid + 1;
                }
            }
        }
        return -1;
    }
}
