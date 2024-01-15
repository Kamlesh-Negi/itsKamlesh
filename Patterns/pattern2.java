package JavaLearning.Patterns;

import java.util.Scanner;

public class pattern2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("enter n ");
		int n = sc.nextInt();
		
	// code for decreasing star pattern

		for (int i=n; i>=1;i--)
		{
			for(int j=i; j>=1; j--) 			
			{
				System.out.print("*");
			}
			System.out.println(" ");
		}
sc.close();
	}
	
}
