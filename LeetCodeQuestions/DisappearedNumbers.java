package JavaLearning.LeetCodeQuestions;


// Given an array nums of n integers where nums[i] is in the range [1,n], return an array of all the integers in the
// range[1,n] that do not appear in nums
// example: I/O: nums = [4,3,2,7,8,2,3,1]  O/P: [5,6]
//  I/O: nums = [1,1]  O/P: [2]

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DisappearedNumbers {
    public static void main(String[] args){
        int[] nums = {4,3,2,7,8,2,3,1};
        List<Integer> ans = disappearedNumbers(nums);
        System.out.println(Arrays.toString(nums));
        System.out.println("Missing numbers " + ans);

    }

   public static List<Integer> disappearedNumbers(int[] nums ){
        int i= 0;
        while(i < nums.length){
            int correct = nums[i]-1;
            if(nums[i] != nums[correct]){
                swap(nums,i,correct);
            }else{
                i++;
            }
        }
            /* find the missing number:
                 if range is [0,n] ==> every element will be at index = value
                 if range is [1,n] ==> every element will be at index = value - 1
            */

       List<Integer> ans = new ArrayList<>();
       for (int index = 0; index < nums.length; index++) {
           if(nums[index] != index+1){
               ans.add(index + 1);                      // missing value is = index + 1
           }
       }
       return ans;
   }
    static void swap(int[] nums, int first, int second){
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }

}
