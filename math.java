package Testing_academy;

import java.util.Scanner;

public class math {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter x: ");
		double x= sc.nextDouble();
		System.out.println("Enter y: ");
		double y= sc.nextDouble();
		System.out.println("Enter z: ");
		double z= sc.nextDouble();
		double result= Math.cbrt(Math.pow(x, 2)+Math.pow(y, 2)-Math.abs(z));			 //double is "CAST" to int
		System.out.println("Result is "+result);
		
	}

}
