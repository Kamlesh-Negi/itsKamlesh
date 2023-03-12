package Testing_academy;

import java.util.Scanner;

public class prime_no {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number ");
		int n= sc.nextInt();
	
	//Finding  a prime no. upto the value entered by the user
		
		
		for(int i=1;i<=n;i++)
		{
			int count=0;
			for(int j=2;j<=i/2;j++)
			{
			if(i%j==0 )
			{
				count++;
				break;
			}
		}		
		
				if(count==0)
				{
						System.out.println(i);
						

				}
		}	
			
	}
	}



