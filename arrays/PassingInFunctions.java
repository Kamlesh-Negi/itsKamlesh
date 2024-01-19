package JavaLearning.arrays;

import java.util.Arrays;

public class PassingInFunctions {
    public static void main(String[] args) {
        int[] nums = {3,5,45,89};
        System.out.println(Arrays.toString(nums));
        change(nums);
        System.out.print(Arrays.toString(nums));
    }

    private static void change(int[] arr) {
        arr[2] = 123;
    }
}
