package JavaLearning.Functions_Methods;

import java.util.Scanner;

public class Greetings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Your Name: ");
        String name = sc.nextLine();
        fun_Greeting(name);
    }
    static void fun_Greeting(String s)
    {
        System.out.print("Hello "+s+"!");
    }
}
