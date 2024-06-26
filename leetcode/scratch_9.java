package leetcode;

import java.util.ArrayList;
import java.util.List;

class Scratch {
    public static void main(String[] args) {
        
    }
}

class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int maxValue = 0;
        for  (int i : candies) {
            if (i > maxValue) {
                maxValue = i;
            }
        }

        List<Boolean> result = new ArrayList<>();
        for (int i : candies) {
            if (i + extraCandies > maxValue ) {
                result.add(true);
            } else {
                result.add(false);
            }
        }
        return result;
    }
}