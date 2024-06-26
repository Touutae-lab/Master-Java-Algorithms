package leetcode;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

class Solution {
    public static int binarySearch(List<Integer> arr, int target) {
        int left = 0, right = arr.size();
        while (left <= right) {
            int middle = (right -  left ) / 2;
            int temp = arr.get(middle);
            if (temp == target) {
                return middle;
            } else if (temp > target) {
                left = middle + 1;
            } else {
                right = middle - 1;
            }
        }
        return -1;
    }

    public static List<String> splitWords(String s) {
        return s.isEmpty() ? List.of() : Arrays.asList(s.split(" "));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> arr = splitWords(scanner.nextLine()).stream().map(Integer::parseInt).collect(Collectors.toList());
        int target = Integer.parseInt(scanner.nextLine());
        scanner.close();
        int res = binarySearch(arr, target);
        System.out.println(res);
    }
}