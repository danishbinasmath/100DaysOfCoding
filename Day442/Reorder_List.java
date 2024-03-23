package Day442;

public class Reorder_List {

    // Definition for singly-linked list.
    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    class Solution {
        public void reorderList(ListNode head) {
            ListNode hf = head;
            ListNode mid = getMid(head);
            ListNode hs = reverse(mid);

            while (hf != null && hs != null) {
                ListNode temp = hf.next;
                hf.next = hs;
                hf = temp;

                temp = hs.next;
                hs.next = hf;
                hs = temp;
            }

            if (hf != null) {
                hf.next = null;
            }
        }

        public ListNode reverse(ListNode head) {
            ListNode prev = null;
            ListNode curr = head;

            while (curr != null) {
                ListNode curr1 = curr.next;
                curr.next = prev;
                prev = curr;
                curr = curr1;
            }

            return prev;
        }

        public ListNode getMid(ListNode head) {
            ListNode slow = head;
            ListNode fast = head;

            while (fast != null && fast.next != null) {
                slow = slow.next;
                fast = fast.next.next;
            }

            return slow;
        }
    }
}