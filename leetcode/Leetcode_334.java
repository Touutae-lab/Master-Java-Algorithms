package leetcode;

public class Leetcode_334 {
    public static void main(String[] args) {
        int[] nums = new int[] {2,1,5,0,4,6};
        Solution solution = new Solution();
        System.out.println(solution.increasingTriplet(nums));
    }
}


class Solution {
    public boolean increasingTriplet(int[] nums) {
        if (nums.length < 3) {
            return false;
        }

        int smallest = Integer.MAX_VALUE;
        int middle = Integer.MAX_VALUE;
        
        for  (int num : nums) {
            if (num > middle) {
                return true;
            }

            if (num < smallest) {
                smallest = num;
            } else if (num > smallest && num < middle) {
                middle = num;
            }
        }


        return false;
    }
}