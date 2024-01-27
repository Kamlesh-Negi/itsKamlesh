package JavaLearning.Maths;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner in =  new Scanner(System.in);
        System.out.println("Choose a fruit among mango, apple, orange and grapes");
        String fruit = in.next();

        switch (fruit) {
            case "mango" -> System.out.println("King of fruits");
            case "apple" -> System.out.println("A sweet red fruit");
            case "orange" -> System.out.println("Rich in vitamin C");
            case "grapes" -> System.out.println("small fruit");
            default -> System.out.println("please choose a valid fruit");
        }
    }
}
