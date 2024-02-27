package JavaLearning.LeetCodeQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Given an integer array nums of length n where all the integers of nums are in the range [1,n] and each integer
// appears once or twice, return an array of all the integers that appears twice.
// example: I/O: numbs = [4,3,2,7,8,2,3,1]
//          O/P: [2,3]
public class AllDuplicateNumber {
    public static void main(String[] args) {
        int[] nums = {4,3,2,7,8,2,3,1};
        List<Integer> ans = findAllDuplicate(nums);
        System.out.println(Arrays.toString(nums));
        System.out.println("Duplicate numbers " + ans);
    }

    public static List<Integer> findAllDuplicate(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            int correct = nums[i] - 1;
            if (nums[i] != nums[correct]) {
            swap(nums, i, correct);
        } else {
                i++;
            }
        }
       List<Integer> ans = new ArrayList<>();
        for (int index = 0; index < nums.length; index++) {
            if (nums[index] != index+1) {
                ans.add(nums[index]);
            }
        }
        return ans;
    }

        public static void swap ( int[] nums, int first, int second){
            int temp = nums[first];
            nums[first] = nums[second];
            nums[second] = temp;
        }
    }

