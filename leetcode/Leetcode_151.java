package leetcode;

public class Leetcode_151 {
    
}


class Solution {
    public String reverseWords(String s) {
        String[] word = s.split(" ");

        StringBuilder result = new StringBuilder();
        for (int i = word.length - 1; i >= 0; i--) {
            if (!word[i].isBlank()) {
                result.append(word[i]);
                result.append(" ");
            }
        }

        return result.toString().trim();
    }
}