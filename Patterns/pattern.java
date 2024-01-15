package JavaLearning.Patterns;

import java.util.Scanner;

public class pattern {

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

			System.out.println(" ");

		}
		
		System.out.println("code 2");
	// code-2 for decreasing star pattern
		
		for (int i=n; i>=1;i--)
		{
			for(int j=i; j>=1; j--) 			// for arrow pattern use j>1 and run code1+code2
			{
				System.out.print("*");
			}
			System.out.println(" ");
		}

	// code-3 for star pattern where each row has 	

		System.out.println("code-4");
	//code for star pattern decreasing order from left to right	
		
		for (int i=n; i>=1; i--)
		{
			for(int s=n-1; s>=i; s--) 			// for arrow pattern use j>1 and run code1+code2
			{
				
					System.out.print(" ");
				
			}
			
			for(int j=i; j>=1; j--)
			{
			System.out.print(".");
			}
			
			System.out.println("");
		}
		
		//code for mix star pattern upper
		System.out.println("code-5");
		
		for (int i=1; i<=n; i++)
		{
			for(int j=1; j<=i; j++)
			{
			System.out.print("*");
			}		//for spaces
			int spaces=2*(n-i);
			for (int a=1; a<=spaces; a++)
			{
				System.out.print(" ");
				
			}
			
			for(int j=1; j<=i; j++)
			{
				System.out.print("*");
			}
			
				System.out.println("");
			}
		sc.close();
	}	

}
