package Day441;

public class Palindrome_Linked_List {

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
        public boolean isPalindrome(ListNode head) {
            ListNode midValue = mid(head);
            ListNode reverseListOfMid = reverse(midValue);

            while (head != null && reverseListOfMid != null) {
                if (head.val != reverseListOfMid.val) {
                    break;
                }

                head = head.next;
                reverseListOfMid = reverseListOfMid.next;
            }

            if (head == null || reverseListOfMid == null) {
                return true;
            }

            return false;
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

        public ListNode mid(ListNode head) {
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