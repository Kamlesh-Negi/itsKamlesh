package JavaLearning.LeetCodeQuestions;


import java.util.Arrays;

// Given an array nums containing n distinct numbers in the range [0,n], return the only number in the range that is
// missing form the array.
// example: I/O: nums = [3,0,1]    O/P : 2
// explanation n = 3 since there are 3 numbers, so all numbers are in the range [0,3]. 2 is the missing number in the
// range since it does not appear in nums
public class MissingNumber {
    public static void main(String[] args){
        int[] arr = {3,0,2,1};
        System.out.println(findMissingNumber(arr));
        System.out.println(Arrays.toString(arr));
    }
    static int findMissingNumber(int[] arr){
        int i = 0;
        while(i<arr.length){
            int correct = arr[i];                       // correct index of the element should be equal to its index
            if(arr[i] < arr.length && arr[i] != arr[correct]){
                swap(arr, i, correct);
            }else{
                i++;
            }
        }
// search for first missing element
        for(int index = 0; index < arr.length; index++){
            if(arr[index] !=  index){
                return index;
            }
        }

        // case 2 - if the element is not in the array e.g. n = 4 and array [1,0,2,3] then 4 would be at index 4 wich
        // is equal to array length
        return arr.length;
    }

    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first]= arr[second];
        arr[second] = temp;
    }

}
