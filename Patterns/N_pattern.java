package JavaLearning.Patterns;

import java.util.Scanner;

public class N_pattern {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter n ");
		int n = sc.nextInt();
for(int i=1;i<=n;i++)
{
	for(int j=1;j<=n;j++)
	{
		if(j==1 || j==i || j==n  )
		{
			System.out.print("*");
		}
		else {
			System.out.print(" ");
		}
		
		
	}
	System.out.println();
}
sc.close();
	}

}
