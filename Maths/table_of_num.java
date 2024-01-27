package JavaLearning.Maths;

import java.util.Scanner;

public class table_of_num {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter a number ");
		int n= sc.nextInt();
		
		int t=0;

/*int i=1;
		while(i<=10)
		{
			t= i*n;
			System.out.println(n+" X "+i+" = "+t);
			i++;
		}
		*/

		for(int i=1; i<=10; i++)
		{
			t=n*i;
			System.out.println(n+" X "+i+" = "+t);

		}

		sc.close();
	}
}
