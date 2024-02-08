package JavaLearning.Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = getUserInput();
        bubbleSort(arr);
        System.out.println("Sorted Array: " + Arrays.toString(arr));
    }

    static int[] getUserInput() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the array length: ");
        int arrayLength = sc.nextInt();
        int[] arr = new int[arrayLength];
        System.out.println("Enter the array elements:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    static void bubbleSort(int[] arr) {
        boolean swapped;
        for (int i = 0; i < arr.length; i++) {
             swapped = false;
            for (int j = 1; j < arr.length-i; j++) {
                // swap if the item is smaller than the previous item
                if (arr[j] < arr[j-1]) {
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapped = true;
                }
            }
            // if for i-th pass if value at j is never swapped than the array is already sorted
         if(!swapped){          //!false = true
             break;
         }

          //  System.out.println(i + " " + Arrays.toString(arr) + " ");     // will print all the steps in sorting
        }
    }
}
