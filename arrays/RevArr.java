package JavaLearning.arrays;

public class RevArr {
    public static void main(String[] args) {
        int[] arr = new int[]{2, 5 ,8 ,9};
        System.out.print("Original array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.print("Reversed Array: ");
        for (int i = arr.length-1; i >= 0; i--) {
            System.out.print(arr[i]+" ");
        }
        }
    }
