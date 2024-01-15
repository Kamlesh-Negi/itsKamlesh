package JavaLearning;

import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of element you want in the series ");
        int n = sc.nextInt();
       int temp,a=0, b=1;
         /* for(int i=0;i<n;i++) {
            if (i <= 1) {
                temp = i;
            } else {
                temp = a + b;
                a = b;
                b = temp;
            }
              System.out.print(temp+" ");

          }
        System.out.print("\nThe "+n+"th fibonacci no. is "+b);
*/
          int count=0;
     System.out.print(count+" ");
          while(count<n-1)
          {
              temp = b;
              b = b + a;
              a = temp;
              count++;
              System.out.print(a+" ");
          }
        sc.close();
    }
}
