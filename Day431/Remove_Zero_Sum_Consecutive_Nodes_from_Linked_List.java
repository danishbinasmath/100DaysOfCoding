package Day431;

import java.util.HashMap;
import java.util.Map;

public class Remove_Zero_Sum_Consecutive_Nodes_from_Linked_List {

 // Definition for singly-linked list.
  public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
 

 class Solution {
    public ListNode removeZeroSumSublists(ListNode head) {
        ListNode front = new ListNode(0, head);
        ListNode current = front;
        int prefixSum = 0;
        Map<Integer, ListNode> prefixSumToNode = new HashMap<>();
        while (current != null) {
            // Add current's value to the prefix sum
            prefixSum += current.val;

            // If prefixSum is already in  the hashmap, 
            // we have found a zero-sum sequence:
             if (prefixSumToNode.containsKey(prefixSum)) {
                ListNode prev = prefixSumToNode.get(prefixSum);
                current = prev.next;

                // Delete zero sum nodes from hashmap
                // to prevent incorrect deletions from linked list
                int p =  prefixSum + current.val;
                while (p != prefixSum) {
                    prefixSumToNode.remove(p); 
                    current = current.next;
                    p +=  current.val;
                }

                // Make connection from the node before 
                // the zero sum sequence to the node after
                prev.next = current.next;
            } else {
                // Add new prefixSum to hashmap
                prefixSumToNode.put(prefixSum, current);
            }
            // Progress to next element in list
            current = current.next;
        }
        return front.next;
    }
}
}