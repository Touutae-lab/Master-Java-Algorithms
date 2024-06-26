package leetcode;

import java.util.HashMap;

class Scratch {
    public static void main(String[] args) {
        int[] nums = new int[] {1,2,1,2,3};
        int k = 2;
        Solution solution = new Solution();
        System.out.println(solution.subarraysWithKDistinct(nums, k));


//        nums = new int[] {1 , 3, 2, 3, 3};
//        k = 3;
//        System.out.println(solution.subarraysWithKDistinct(nums, k));
    }
}


class Solution {
    public int mostKSubarrayWithDistinct(int[] nums, int k) {
        int n = nums.length;
        int count = 0;
        int left = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int right = 0; right < n; right++) {
            map.put(nums[right], map.getOrDefault(nums[right], 0) + 1);
            while (map.size() > k) {
                map.put(nums[left], map.get(nums[left]) - 1);
                if (map.get(nums[left]) == 0) {
                    map.remove(nums[left]);
                }
                left++;
            }
            count += right - left + 1;
        }
        return count;
    }
    public int subarraysWithKDistinct(int[] nums, int k) {
        return mostKSubarrayWithDistinct(nums, k) - mostKSubarrayWithDistinct(nums, k - 1);
    }
}
