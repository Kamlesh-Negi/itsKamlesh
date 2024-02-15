package JavaLearning.Sorting;

import java.util.Arrays;
import java.util.Scanner;

// cyclic sort is generally used to sort the elements ranging from 1 to n where each element's correct index is at the
// index-1
// Time Complexity- O(n)

public class CyclicSort {
    public static void main(String[] args){
        int[] arr = getUserInput();
    cyclicSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static int[] getUserInput() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the array length: ");
        int len = sc.nextInt();
        int[] arr = new int[len];
        System.out.println("Enter the array: ");
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        return arr;
    }
    static void cyclicSort(int[] arr){
        int i = 0;
        while (i < arr.length){
            int correct = arr[i] - 1;
            if(arr[i] != arr[correct]){
                swap(arr,i,correct);
            }
            else{
                i++;
            }
        }
    }

    static void swap(int[] arr, int first, int second)
    {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}

