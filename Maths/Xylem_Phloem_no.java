package JavaLearning.Maths;

import java.util.Scanner;

public class Xylem_Phloem_no {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        int extreme_sum = 0, mean_sum=0;
        int temp = num;
        while(temp!=0)
        {
            if(temp==num || temp<10)          //the first and last digits of number are always less than 10
            {
                extreme_sum = extreme_sum + temp%10;
            }
            else {
                mean_sum = mean_sum + temp%10;
            }
            temp = temp/10;
        }
        System.out.println("sum of extreme digits = "+extreme_sum ) ;
        System.out.println("sum of mean digits = "+mean_sum);
        if(extreme_sum == mean_sum)
            System.out.println("Xylem number");
        else
            System.out.println("Phloem number");
    }
}
