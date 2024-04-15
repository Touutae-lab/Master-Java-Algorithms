class Scratch {
    public static void main(String[] args) {
        int[] input = {1,0,0,0,1};
        int n = 1;

        Solution sol = new Solution();

        System.out.println(sol.canPlaceFlowers(input, n));

        input = new int[]{1, 0, 0, 0, 0, 1};
        n = 2;

        System.out.println(sol.canPlaceFlowers(input, n));


        input = new int[]{0,0,1,0,1};
        n =1;

        System.out.println(sol.canPlaceFlowers(input, n));


    }
}


class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {

        if (n > (flowerbed.length / 2) + 1) {
            return false;
        }

        int left = 0;
        while (left < flowerbed.length) {
            if (flowerbed[left] == 1) {
                left++;
            } else if (flowerbed[left] == 0) {
                if (left - 1 >= 0 && flowerbed[left - 1] == 0 || left == 0) {
                    if (left + 1 < flowerbed.length && flowerbed[left + 1] == 0 || left == flowerbed.length - 1) {
                        n -= 1;
                        left++;
                    }
                }
            }
            left++;
        }
        return n <= 0;
    }
}