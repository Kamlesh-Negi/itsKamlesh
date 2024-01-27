package JavaLearning.Maths;

import java.util.Scanner;

public class MaxThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("first: ");
        int first = sc.nextInt();
        System.out.print("second: ");
        int second = sc.nextInt();
        System.out.print("third: ");
        int third = sc.nextInt();
        int max = first;
        if(max < second)
        {
            max = second;
        }
        if (max < third)
        {
            max = third;
        }
        System.out.println("the maximum number is "+max);

//  using Math class

        int largest = Math.max(first,Math.max(second, third));
        System.out.println("the largest number is "+largest);



    }
}
