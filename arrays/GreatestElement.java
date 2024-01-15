package arrays;

import java.util.Scanner;

public class GreatestElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number of element you want: ");
        int len = sc.nextInt();
        int[] arr = new int[len];
        System.out.print("Enter the array elements: ");
        for (int i = 0; i < len; i++) {
            arr[i] = sc.nextInt();
        }
// printing the entered Array and the largest element
        System.out.print("entered array: ");
        int large = arr[0];
        for (int i=0; i<len; i++){
            System.out.print(arr[i] +" ");      // to print the entered array

            if(large <= arr[i]) {
                large = arr[i];
            }
        }
        System.out.println("\nlargest element in array is: "+large);
            sc.close();
    }
}
