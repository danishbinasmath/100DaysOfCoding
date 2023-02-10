package Day17;

public class Diameter_of_Binary_Tree {

    class Solution {
        int max = 0;

        public int diameterOfBinaryTree(TreeNode root) {
            inDepth(root);
            return max;
        }

        public int inDepth(TreeNode root) {
            if(root == null) {
                return 0;
            }

            int left = inDepth(root.left);
            int right = inDepth(root.right);

            max = Math.max(max, left + right);

            return Math.max(left, right) + 1;
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
