package Day223;

import java.util.HashMap;
import java.util.Map;

public class Copy_List_with_Random_Pointer {
    class Solution {
        Map<Node, Node> map = new HashMap<>();
        public Node copyRandomList(Node head) {
            if (head == null)
                return null;
            if (map.containsKey(head))
                return map.get(head);
            Node newNode = new Node(head.val);
            map.put(head, newNode);
            newNode.next=copyRandomList(head.next);
            newNode.random=copyRandomList(head.random);
            return newNode;
        }
    }

    // Definition for a Node.
    class Node {
        int val;
        Node next;
        Node random;

        public Node(int val) {
            this.val = val;
            this.next = null;
            this.random = null;
        }
    }

}
