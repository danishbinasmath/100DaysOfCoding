package Day21;

public class Remove_Linked_List_Elements {

    class Solution {
        public ListNode removeElements(ListNode head, int val) {
            if(head == null) return null;
            head.next = removeElements(head.next, val);
            return head.val == val ? head.next : head;
        }
    }

    //Definition for singly-linked list.
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}
