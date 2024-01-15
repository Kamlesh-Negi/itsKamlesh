package JavaLearning;

import java.util.Scanner;

public class add {

	public static void main(String[] args) {

		//int a, b, sum;
		Scanner sc = new Scanner(System.in);
			System.out.print("\nCheck for largest of two numbers");

			System.out.print("\nEnter x = ");
			int x = sc.nextInt();
			System.out.print("Enter y = ");
			int y = sc.nextInt();
			if (x == y) {

				System.out.print("Both are equal");
			}

			/*
			 * else
			 *  {					 //here we are using if-else-if -----all other conditions inside the else block 
			 *		 if (x > y) 
			 * 			{
			 * 		 		System.out.println("X is Greater");
			 * 			 }
			 * 		 else 
			 *  		{
			 *  			 System.out.println("Y is Greater");
			 * 			} 
			 * 	}
			 */
			else if (x > y) 		 // here we are using else-if-------all other condition in else-if block
				{	System.out.println("X is Greater");

				}
				else 		 // final else block of else block
					{				
						System.out.println("Y is Greater");

					}
	sc.close();	
	}
	}

