package Day61;

import java.util.ArrayList;
import java.util.List;

public class N_ary_Tree_Preorder_Traversal {

    class Solution {
        public List<Integer> list = new ArrayList<>();
        public List<Integer> preorder(Node root) {
            if (root == null)
                return list;

            list.add(root.val);
            for(Node node: root.children)
                preorder(node);

            return list;
        }
    }


    // Definition for a Node.
    class Node {
        public int val;
        public List<Node> children;

        public Node() {}

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, List<Node> _children) {
            val = _val;
            children = _children;
        }
    };


}
