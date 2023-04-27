package Day76;

public class Range_Sum_of_BST {

    class Solution {
        public int rangeSumBST(TreeNode root, int low, int high) {
            if(root == null) return 0;
            if(root.val > high) return rangeSumBST(root.left, low, high);
            if(root.val < low) return rangeSumBST(root.right, low, high);
            return root.val + rangeSumBST(root.right, low, high) + rangeSumBST(root.left, low, high);
        }
    }

     // Definition for a binary tree node.
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