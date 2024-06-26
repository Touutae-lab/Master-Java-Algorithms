package leetcode;

import java.util.HashMap;
import java.util.Map;

class Scratch {
    public static void main(String[] args) {
        
    }
}
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

class Solution {
    public ListNode removeZeroSumSublists(ListNode head) {
        Map<Integer, ListNode> prefixSum = new HashMap<>();
        ListNode runner = head;
        while (runner != null) {
            if  (prefixSum.containsKey(runner.val)) {
                ListNode previous = prefixSum.get(sum).next;
                if (previous == head) {

                    head = runner.next;
                } else {
                    while (toRemove != runner) {

                    }
                }
            }  else {
                prefixSum.put(sum, runner);
            }
            runner = runner.next;
        }
        return head;
    }
}