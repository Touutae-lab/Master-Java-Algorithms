class Scratch {
    public static void main(String[] args) {

    }
}

class Solution {
    public boolean checkValidString(String s) {
        int minDept = 0, maxDept = 0;
        for (char i : s.toCharArray()) {
            if (i == '(') {
                minDept += 1;
                maxDept += 1;
            } else if (i == ')') {
                minDept -= 1;
                maxDept -= 1;
            } else if (i == '*') {
                minDept -= 1;
                maxDept += 1;
            }
            if (maxDept < 0) {
                return false;
            }
            if (minDept < 0) {
                minDept = 0;
            }
        }
    return true;
    }
}