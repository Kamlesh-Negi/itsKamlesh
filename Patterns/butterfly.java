package JavaLearning.Patterns;

import java.util.Scanner;

public class butterfly {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("enter n ");
		int n = sc.nextInt();
		
		//code for upper part
								
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
				//for bottom part 
				
				for (int i=n; i>=1; i--)
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
					
						System.out.println();
					}	
				sc.close();

	}

}
