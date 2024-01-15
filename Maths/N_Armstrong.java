package JavaLearning;

import java.util.Scanner;

public class N_Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the limit: ");
        int input = sc.nextInt();
        System.out.println("Armstrong number up to "+input);
        for(int i = 0; i <= input; i++)
       {
           int num = i;
           int n = String.valueOf(num).length();
           int result = 0;
           while(num > 0)
        {
            int rem = num % 10;
            num = num/10;
            result = (int) (result + Math.pow(rem , n));
        }
        if (result == i){
            System.out.print(result+" ");
        }
        }
    }
}
