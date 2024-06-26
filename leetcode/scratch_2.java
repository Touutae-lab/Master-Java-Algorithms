package leetcode;

class Scratch {
    public static void main(String[] args) {
        int[] nums = new int[] {1,3,5,2,7,5};
        int minK = 1, maxK = 5;
        Solution solution = new Solution();
        System.out.println(solution.countSubarrays(nums, minK, maxK));

        nums = new int[] {1,1,1,1};
        minK = 1;
        maxK = 1;
        System.out.println(solution.countSubarrays(nums, minK, maxK));

        nums = new int[] {35054,398719,945315,945315,820417,945315,35054,945315,171832,945315,35054,109750,790964,441974,552913};
        minK = 35054;
        maxK = 945315;
        System.out.println(solution.countSubarrays(nums, minK, maxK));
    }
}

class Solution {
    public long countSubarrays(int[] nums, int minK, int maxK) {
        int n = nums.length;
        long count = 0;
        int lastMin = -1, lastMax = -1, lastLeft = -1;

        for (int left = 0; left < n; left++) {
            if (nums[left] < minK || nums[left] > maxK) {
                lastLeft = left;
            }
            if (nums[left] == minK) {
                lastMin = left;
            }
            if (nums[left] == maxK) {
                lastMax = left;
            }
            if (lastMin != -1 && lastMax != -1) {
                count += Math.max(0, Math.min(lastMin, lastMax) - lastLeft);
            }
        }

        return count;
    }
}