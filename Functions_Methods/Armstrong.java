package JavaLearning.Functions_Methods;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the upper limit to find Armstrong numbers up to: ");
        int limit = sc.nextInt();

        System.out.println("Armstrong numbers up to " + limit + ":");
        for (int i = 0; i <= limit; i++) {
            if (isArmstrong(i)) {
                System.out.print(i + " ");
            }
        }
    }

    private static boolean isArmstrong(int n) {
        int original = n;
        int numberOfDigits = countDigits(n);
        int sum = 0;

        while (n > 0) {
            int digit = n % 10;
            sum = sum + power(digit, numberOfDigits);
            n = n / 10;
        }

        return sum == original;
    }

    private static int countDigits(int n) {
        int count = 0;
        while (n > 0) {
            count++;
            n /= 10;
        }
        return count;
    }

    private static int power(int base, int exponent) {
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= base;
        }
        return result;
    }
}
