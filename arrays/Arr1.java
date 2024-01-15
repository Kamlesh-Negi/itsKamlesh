package arrays;

public class Arr1 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        int i =0;
        while(i<=5)
        {
            arr[i]=i;
            i++;
        }
        i=0;
       while (i<=5) {
            System.out.print(arr[i] + " ");
            i++;
        }

    }
}
