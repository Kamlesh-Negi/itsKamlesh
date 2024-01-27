package JavaLearning.Maths;

import java.util.Scanner;

public class Sum_of_N_num {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			System.out.print("enter the number ");
			int i= sc.nextInt();
			System.out.println(i);
			int n=1;
			int sum=0;

			/* using "while loop"

			while(n<=i)
			{
				sum=sum+n;
				n++;
				
			}
			System.out.println("The sum of first "+i+" numbers is "+sum);
*/
					
/*  Using "for loop"

	for(n=1; n<=i; n++)
			{
				sum=sum+n;
			}
			System.out.println("The sum of first "+i+" numbers is "+sum);
*/	
		//using "do-while"
			do {
				sum=sum+n;
				n++;
			}while(n<=i);
			
			System.out.println("The sum of first "+i+" numbers is "+sum);
	
			sc.close();
	}
	

	}

