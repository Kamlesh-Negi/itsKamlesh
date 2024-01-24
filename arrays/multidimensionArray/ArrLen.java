package JavaLearning.arrays.multidimensionArray;

import java.util.Arrays;

public class ArrLen {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3},
                {4, 5},
                {6, 7, 8, 9}
        };
        System.out.println("arr.length = "+arr.length);
        System.out.println("arr[0].length = "+arr[0].length);
        System.out.println("arr[1].length = "+arr[1].length);
        System.out.println("arr[2].length = "+arr[2].length);
              // print array
        for(int[] num : arr) {
            System.out.println(Arrays.toString(num));
        }
    }


}
