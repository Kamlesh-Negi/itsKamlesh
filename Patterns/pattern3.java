package JavaLearning.Patterns;

import java.util.Scanner;

public class pattern3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("enter n ");
		int n = sc.nextInt();
	//code for star pattern decreasing order from left to right	
		
		for (int i=n; i>=1; i--)
		{
			for(int s=n-1; s>=i; s--) 			
			{
				
					System.out.print(" ");
				
			}
			
			for(int j=i; j>=1; j--)
			{
			System.out.print("*");
			}
			
			System.out.println();
		}
	
		sc.close();
	}

}
