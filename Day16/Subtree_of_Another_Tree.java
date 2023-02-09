package Day16;

public class Subtree_of_Another_Tree {
    class Solution {
        public boolean isSubtree(TreeNode root, TreeNode subRoot) {
            if(root == null){
                return false;
            }
            if(isIdentical(root, subRoot)) {
                return true;
            }
            return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
        }

        public boolean isIdentical(TreeNode root, TreeNode subRoot) {
            if(root == null || subRoot == null) {
                return (root == null & subRoot == null);
            }else if(root.val == subRoot.val) {
                return isIdentical(root.left, subRoot.left) && isIdentical(root.right, subRoot.right);
            }else {
                return false;
            }
        }
    }

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
}
