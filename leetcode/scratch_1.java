package leetcode;

class Scratch {
    public static void main(String[] args) {
        int[] nums = new int[] {1 , 3, 2, 3, 3};
        int k = 2;
        Solution solution = new Solution();
        System.out.println(solution.countSubarrays(nums, k));
    //        nums = [1,3,2,3,3], k = 2
    }
}


class Solution {
    public long countSubarrays(int[] nums, int k) {
        int n = nums.length;
        int count = 0;
        int maxValue = 0;

        // Find max
        for (int i : nums) {
            maxValue = Math.max(maxValue, i);
        }

        int right = 0;
        int freq = 0;
        for (int left = 0; left < n; left++) {
            while (right < n && freq < k) {
                if (nums[right] == maxValue) {
                    freq++;
                }
                right++;
            }

            if (freq < k) {
                break;
            }

            count += n - right + 1;
            if (nums[left] == maxValue) {
                freq--;
            }
        }
        return count;
    }
}