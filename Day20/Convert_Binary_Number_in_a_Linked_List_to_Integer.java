package Day20;

public class Convert_Binary_Number_in_a_Linked_List_to_Integer {

        class Solution {
            public int getDecimalValue(ListNode head) {
                int num = head.val;
                while(head.next != null) {
                    num = num * 2 + head.next.val;
                    head = head.next;
                }
                return num;
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
