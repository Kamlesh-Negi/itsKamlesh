package JavaLearning.Patterns;

import java.util.Scanner;

public class Floyd_triangle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter n ");
		int n = sc.nextInt();
		int counter=1;
		for(int i=1; i<=n; i++)
		{
			for(int j=1; j<=i; j++)
			{
				System.out.print(counter+" ");
				counter++;
			}
			System.out.println();
	
		}
		
sc.close();
	
	}		
}
