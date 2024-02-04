package JavaLearning.Searching;

import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("no. of elements in array you want: ");
        int len = sc.nextInt();
        int[] arr = new int[len];
        System.out.println("enter the array element: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("enter the target element ");

        int target = sc.nextInt();
        int result = binarySearch(arr,target);
        if(result == -1){
            System.out.println(target+" is not in the array");
        }
        else{
            System.out.println(target+" is at index "+ result);
        }

    }

    // return the index of the target ; return -1 if it does not exist
    static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
