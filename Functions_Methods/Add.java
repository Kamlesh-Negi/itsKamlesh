package JavaLearning.Functions_Methods;

import java.util.Scanner;

public class Add {
    static int Sum()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("enter second number: ");
        int num2 = sc.nextInt();
        int sum = num1 + num2;
        return sum;
    }

    public static void main(String[] args) {
        System.out.println("Sum = "+Sum());
    }
}
