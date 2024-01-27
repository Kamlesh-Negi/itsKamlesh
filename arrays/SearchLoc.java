package JavaLearning.arrays;

import java.util.Scanner;

public class SearchLoc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the no. of element you want in array: ");
        int len = sc.nextInt();
        int[]arr = new int[len];
        System.out.println("enter array elements: ");
        for (int i = 0; i< len; i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("enter the element: ");
        int el = sc.nextInt();
        int loc = -1;   // Initialize loc to -1 indicating not found
        for (int i = 0; i < len; i++) {
            if (el == arr[i]) {
                loc = i;
                break;
            }
        }
       if(loc != -1) {
           System.out.println("element is at index " + loc);
       }else {
           System.out.println("element not present");
       }
       sc.close();
    }
}
