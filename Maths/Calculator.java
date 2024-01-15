package JavaLearning;

import java.util.Scanner;

import static java.lang.Math.abs;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float ans = 0;
        while (true){
            System.out.print("Enter the operator ");
            char op = sc.next().trim().charAt(0);
           if(op == '+' || op == '-' || op == '*' || op =='/' || op == '%')
           {
               System.out.print("Enter the first number: ");
               float num1 = sc.nextFloat();

               System.out.print("Enter the second number: ");
               float num2 = sc.nextFloat();

               if(op =='+'){
                   ans = num1 + num2;
               }
               if(op =='-'){
                   ans = num1 - num2;
               }
               if(op == '*'){
                   ans = num1 * num2;
               }
               if(op == '/'){
                   if(num2 != 0){
                       ans = num1 / num2;
                   }
                   else {
                       System.out.println(" Divide by zero error");
                   }
               }
               if(op == '%'){
                   ans = num1 % num2;
               }
               }
           else if (op == 'x' || op == 'X') {
               break;
           } else {
               System.out.println("Invalid Operation!!");
           }
            System.out.println(ans+"\n(Press x or X to exit)");
        }
    }
}
