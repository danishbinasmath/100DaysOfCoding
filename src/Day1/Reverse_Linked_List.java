package Day1;

public class Reverse_Linked_List {

    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public class Solution {
        public ListNode reverseList(ListNode head) {
            if(head == null || head.next == null) {
                return head;
            }

            ListNode prev = null;
            ListNode curr = head;
            ListNode next = curr.next;

            while(curr != null) {
                curr.next = prev;
                prev = curr;
                curr = next;
                if(next != null) {
                    next = next.next;
                }
            }

            return prev;
        }
    }
}
