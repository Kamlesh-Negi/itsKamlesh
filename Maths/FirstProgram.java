package JavaLearning.Maths;

import java.util.Scanner;


public class FirstProgram {

	public static void main(String[] args) {
		
	/*	System.out.println("Hello world"); 
		System.out.print("this is the line with print");
		System.out.print("\nthis is the line with backslash n at the start");
		System.out.print("this is the line with print and backslash n at the end\n");
		System.out.print("this is the line with print");
		System.out.print("this is the line with print\n continue\n continue after backslash n");
		*/
		
		
		// Factorial
		
		Scanner sc = new Scanner(System.in);
		//int choice = sc.nextInt();
		System.out.println("enter a number");		

		int n= sc.nextInt();
		int factorial=n;
		for(int i=1;i<n;i++)
		{
			factorial=factorial*i;
		}
		System.out.println("Factorial of "+n+" is "+factorial);

sc.close();
	}

			
		
	}


