/**
 * 
 */
package Testing_academy;

import java.util.Scanner;

public class Switch_examples {

	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		while(true)
		{
			;
			
			System.out.println("1. Factorial");
			System.out.println("2. odd/even");
			System.out.println("3. Prime");
	//		System.out.println("4. exit");
			System.out.print("enter your choice ");
			int choice = sc.nextInt();			
switch(choice)
{
case 1 :
	System.out.print("\nYou have opt for Factorial\n\nEnter a number ");		
	int n= sc.nextInt();
	int factorial=n;
	for(int i=1;i<n;i++)
	{
		factorial=factorial*i;
	}
	System.out.println("Factorial of "+n+" is "+factorial);
	
break;

case 2 :
	System.out.print("\nYou have opt for Odd/Even\n\nEnter a number ");		
	int x= sc.nextInt();
	if(x%2==0)
	{
		System.out.println("even");
	}
	else
		System.out.println("odd");
	
break;

case 3 :
	System.out.println("Enter the number ");
	int p= sc.nextInt();
	int count=0;
	for(int i=2;i<p/2;i++)
	{
		if(p%i==0)
		{
			count++;
			//break;
		}
		
	}
	if(count==0)
	{
		System.out.println("Prime");
	}
	else {
		System.out.println("Not Prime");
	}
break;
	
default :
	System.out.println("Invalid choice");
	
}

System.out.println("------------------------------------------");

		}
	}

}
