package JavaLearning.Patterns;

import java.util.Scanner;

public class pattern4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter n ");
		int n = sc.nextInt();
		
		//code for mix star pattern upper
								
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
