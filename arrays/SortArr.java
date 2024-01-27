package JavaLearning.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class SortArr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the no. of elements you want in Array: ");
        int len = sc.nextInt();
        int[] arr = new int[len];
        System.out.println("enter array elements: ");
        for(int i=0; i<len; i++){
            arr[i] = sc.nextInt();
        }
        for(int i = 0; i < len; i++)
        {
            for (int j = i+1; j < len; j++) {
                int temp = 0;
                if(arr[i] > arr[j])
                {
                    temp = arr[i];
                    arr[i]  = arr[j];
                    arr[j] = temp;
                }
            }
            System.out.print(arr[i]+" ");

        }

    }
}
