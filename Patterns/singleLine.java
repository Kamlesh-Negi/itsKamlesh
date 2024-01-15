package JavaLearning.Patterns;

import java.util.Scanner;

public class singleLine {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number of stars you want to print in a line ");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			System.out.println("*");
		}
			sc.close();
	}

}
