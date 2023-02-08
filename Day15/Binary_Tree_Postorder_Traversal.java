package Day15;

import java.util.*;

public class Binary_Tree_Postorder_Traversal {
    //Definition for a binary tree node.
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    class Solution {
        public List<Integer> postorderTraversal(TreeNode root) {
            List<Integer> ans = new ArrayList<>();
            if(root == null) {
                return ans;
            }
            postOrder(root, ans);
            return ans;
        }

        public List<Integer> postOrder(TreeNode root, List<Integer> ans) {
            if(root != null) {
                postOrder(root.left, ans);
                postOrder(root.right, ans);
                ans.add(root.val);
            }
            return ans;
        }
    }
}
