package JavaLearning.arrays;

public class Arr0 {
    public static void main(String[] args) {
        // Default values
        int[] roll_no;     // declaration of array. roll_no is getting defined in the stack.
        roll_no = new int[5];  // initialisation: here, actually, object is being created in the heap memory
        System.out.println("Before assigning value, roll_no[2] =  "+roll_no[2]);

        roll_no[2] = 36;
        System.out.println("After assigning value, roll_no[2] =  "+roll_no[2]);

        //or directly containing roll nos
        int[] roll_no2 = {12, 15, 23, 29};
        System.out.println("After assigning value directly, roll_no[2] =  "+roll_no2[2]);

        String[] arr = new String[4];
        System.out.println("Before assigning, arr[0] =  "+arr[0]);

        arr[2] = "hello";       // assigning a value at index 2
        System.out.println("After assigning, arr[2] =  "+arr[2]);


    }
}
