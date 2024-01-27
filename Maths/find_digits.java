package JavaLearning.Maths;

import java.util.Scanner;

public class find_digits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number: ");
        int num = sc.nextInt();
        int count=0;
        while(num!=0)
        {
            num= num/10;
            count++;
        }
        System.out.println("total number of digits are "+count);
        sc.close();

    }
}
