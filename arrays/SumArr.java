package arrays;

public class SumArr {
    public static void main(String[] args) {
        int[] a = new int[]{1, 2, 3, 4, 6, 7, 5, 10};
        int i = 0;
        int j = 0;
        int sum = 0;
        while (i < a.length)
        {
            sum = sum + a[i];
            i++;
        }
        System.out.println("Sum of the array elements is "+sum);
    }
}
