package JavaLearning.Sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args){
       /* int[] arr = getUserInput();*/
        int[] arr = {5,4,3,2,1};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    private static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            // find the max item in the remaining array and swap with the correct index
            int lastIndex = arr.length-i-1;
            int maxIndex = getMaxIndex(arr,0,lastIndex);
            swap(arr,maxIndex, lastIndex);
        }
    }
    public static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
    private static int getMaxIndex(int[] arr, int start, int end) {
        int max = start;
        for (int i = start; i <= end; i++ ){
            if(arr[max] < arr[i]){
                max = i;
            }
        }
        return max;
    }
}
