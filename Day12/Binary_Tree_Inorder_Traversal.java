package Day12;


import java.util.*;

public class Binary_Tree_Inorder_Traversal {

    //     Definition for a binary tree node.
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
        public List<Integer> inorderTraversal(TreeNode root) {
            List<Integer> ans = new ArrayList<>();
            if(root == null) {
                return ans;
            }

            inorder(root, ans);
            return ans;
        }

        public List<Integer> inorder(TreeNode root, List<Integer> ans) {
            if(root != null) {
                inorder(root.left, ans);
                ans.add(root.val);
                inorder(root.right, ans);
            }

            return ans;
        }
    }
}
