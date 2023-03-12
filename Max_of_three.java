package Testing_academy;

import java.util.*;

public class Max_of_three {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the First number: ");
		int a= sc.nextInt();
		System.out.print("enter the Second number: ");
		int b= sc.nextInt();
		System.out.print("enter the Third number: ");
		int c= sc.nextInt();
		if(a>=b && a>=c)
		{
			System.out.println(a+" is largest");
		}	
		else if(b>=a && b>=c)
		{
			System.out.println(b+" is largest");
		} 
		else
		System.out.println(c+" is largest");
		
	}

}
