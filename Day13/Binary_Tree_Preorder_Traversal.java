package Day13;
import java.util.*;

public class Binary_Tree_Preorder_Traversal {
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
        public List<Integer> preorderTraversal(TreeNode root) {
            List<Integer> ans = new ArrayList<>();
            if(root == null) {
                return ans;
            }
            preorder(root, ans);
            return ans;
        }

        public List<Integer> preorder(TreeNode root, List<Integer> ans) {
            if(root != null) {
                ans.add(root.val);
                preorder(root.left, ans);
                preorder(root.right, ans);
            }
            return ans;
        }
    }
}
