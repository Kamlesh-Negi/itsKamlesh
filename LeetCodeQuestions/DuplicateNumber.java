package JavaLearning.LeetCodeQuestions;

import java.util.Arrays;

// Given an array of integers nums containing n + 1 integers where each integer is in the range [1,n] inclusive.
// There is only one repeated number in nums, return this repeated number
// example: I/O: numbs = [1,3,4,2,2]
//          O/P: 2
public class DuplicateNumber {
    public static void main(String[] args) {
        int[] nums = {1, 3, 4, 2, 2};
        int ans = findDuplicate(nums);
        System.out.println(Arrays.toString(nums));
        System.out.println("Duplicate numbers " + ans);
    }

    public static int findDuplicate(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            if (nums[i] != i + 1) {
                int correct = nums[i] - 1;
                if (nums[i] != nums[correct]) {
                    swap(nums, i, correct);
                } else {
                    return nums[i];
                }
            } else {
                i++;
            }
        }
        return -1;
    }

        public static void swap ( int[] nums, int first, int second){
            int temp = nums[first];
            nums[first] = nums[second];
            nums[second] = temp;
        }
    }

