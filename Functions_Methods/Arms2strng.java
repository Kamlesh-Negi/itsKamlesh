package JavaLearning.Functions_Methods;

import java.util.Scanner;

public class Arms2strng {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the upper limit to find Armstrong numbers up to: ");
        int limit = sc.nextInt();

        System.out.println("Armstrong numbers up to " + limit + ":");
        for (int i = 0; i <= limit; i++) {
            checkAndPrintArmstrong(i);
        }
    }

    private static void checkAndPrintArmstrong(int n) {
        int original = n;
        int numberOfDigits = countDigits(n);
        int sumOfPowers = 0;

        while (n > 0) {
            int digit = n % 10;

            // Calculate power without using a separate function
            int temp = 1;
            for (int i = 0; i < numberOfDigits; i++) {
                temp *= digit;
            }

            sumOfPowers += temp;
            n /= 10;
        }

        if (sumOfPowers == original) {
            System.out.print(original + " ");
        }
    }

    private static int countDigits(int n) {
        int count = 0;
        while (n > 0) {
            count++;
            n /= 10;
        }
        return count;
    }
}
