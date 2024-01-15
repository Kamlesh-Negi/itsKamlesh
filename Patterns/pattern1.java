package JavaLearning.Patterns;

import java.util.Scanner;

public class pattern1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("enter n ");
		int n = sc.nextInt();
		
	// code-1 for increasing star pattern
	
		for (int i = 1; i <= n; i++)
		{
			for (int j = 1; j <= i; j++)
			{
				System.out.print("*");
			}

			System.out.println();

		}
		sc.close();
	}
}