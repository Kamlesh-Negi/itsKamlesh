package JavaLearning.Searching;

import java.util.Arrays;
import java.util.Scanner;

public class RichestCustomerWealth {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[][] accounts = new int[3][3];
        System.out.println("Enter the array elements");
        for (int person = 0; person < accounts.length; person++) {
            for (int account = 0; account < accounts[person].length; account++) {
                accounts[person][account] = sc.nextInt();
            }
        }
// print array
        for (int[] num : accounts) {
            System.out.println(Arrays.toString(num));
        }

        int max = maxWealth(accounts);
        System.out.println("maximum wealth is: " + max);
    }
    public static int maxWealth(int[][] accounts){
        int answer = Integer.MIN_VALUE;
        for (int person = 0; person < accounts.length; person++){
            int sum = 0;
            for (int account = 0; account < accounts[person].length; account++) {
                sum = sum + accounts[person][account];
            }
            if(sum > answer){
                answer = sum;
            }
            System.out.println("sum of each account: "+sum);
        }
            return  answer;
    }
}
