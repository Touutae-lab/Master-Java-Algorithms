class Solution {
    // public int numSubarraysWithSum(int[] nums, int goal) {
    //     int result = 0;
    //     for (int left = 0; left < nums.length; left++) {
    //         int right = left + 1;
    //         int sum = nums[left];
    //         if (sum == goal) {
    //             result += 1;
    //         }
    //         while (right < nums.length && sum <= goal) {
    //             sum += nums[right];
    //             right += 1;

    //             if (sum == goal) {
    //                 result += 1;
    //             }
    //         }
    //     }
    //     return result;
    // }

    public int numSubarraysWithSum(int[] nums, int goal) {
        return numSubarraysWithSumUtil(nums, goal) - numSubarraysWithSumUtil(nums, goal - 1);
    }
    private int numSubarraysWithSumUtil(int[] nums, int goal) {
        if (goal < 0) {
            return 0;
        }
        int left = 0;
        int right = 0;
        int sum = 0;
        int count = 0;
        while (right < nums.length) {
            sum += nums[right];
            while (sum > goal) {
                sum -= nums[left];
                ++left;
            }
            count += right - left + 1;
            ++right;
        }
        return count;
    }
}



class main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {1,0,1,0,1};
        int goal = 2;
        int result = solution.numSubarraysWithSum(nums, goal);
        System.out.println(result);
    }
}