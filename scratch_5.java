class Scratch {
    public static void main(String[] args) {
        
    }
}

class Solution {
    public int lengthOfLastWord(String s) {
        String[] value = s.split(" ");
        return value[value.length - 1].length();
    }
}