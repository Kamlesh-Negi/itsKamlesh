package JavaLearning.Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class InsertionSort {
    public static void main(String[] args){
        int[] arr = getInput();
        insertionSort(arr);
        System.out.print("Sorted Array: "+Arrays.toString(arr));
    }
    static int[] getInput(){
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

    static void insertionSort(int[] arr){
        for(int i = 0; i < arr.length-1; i++)
        {
            for(int j = i+1; j > 0; j--)
            {
                if(arr[j] < arr[j-1]){
                    swap(arr, j, j-1);
                } else {
                    break;
                }
            }
        }
    }
 public static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
 }
}
