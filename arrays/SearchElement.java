package JavaLearning.arrays;

import java.util.Scanner;

public class SearchElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no. of element you want in array: ");
        int len = sc.nextInt();
        int[] arr = new int[len];
        System.out.println("enter the array: ");
        for (int i=0; i<len; i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.print("enter the index of the element you want to find ");
        int index = sc.nextInt();
        for (int i = 0; i <len; i++) {
            if(index>len-1){
                System.out.println("\nInvalid index...Choose index in the range of "+i+" - "+(len-1));
                return;
            } else if(index == i) {
                System.out.println("element at index "+index+" is "+arr[i]);
            }

        }

    }
}
