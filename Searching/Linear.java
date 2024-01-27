package JavaLearning.Searching;

public class Linear {
    public static void main(String[] args) {
        int[] nums = {23, 15, -56, 87, 96, 5, -89, -24, 75, -29, 10};
        int target = -89;
        int ans = linearSearch(nums, target);
        boolean ans2 = linearSearch2(nums, target);
        System.out.println(target+" is at index no. "+ans);
        System.out.println(target+" exists "+ans2 );
    }
    // search in the array: return the index if item is found
    // return -1 if item not found

    static int linearSearch(int[] arr, int target)
    {
        if(arr.length == 0)
        {
            return -1;
        }
        for (int index = 0; index < arr.length; index++) {
            // check for element at every index
            int element = arr[index];
            if (element == target) {
                return index;
            }
        }
        // if none of the above return statement is executed then this line will be executed
        // target not found
        return -1;
    }

    // enhanced for loop
    static boolean linearSearch2(int[] arr, int target)
    {
        if(arr.length == 0)
        {
            return false;
        }
        for (int element : arr) {
            if (element == target) {
                return true;
            }
        }
        // if none of the above return statement is executed then this line will be executed
        // target not found
        return false;
    }
}
