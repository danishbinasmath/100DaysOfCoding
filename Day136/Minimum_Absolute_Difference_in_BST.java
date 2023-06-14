package Day136;

import java.util.ArrayList;
import java.util.List;

public class Minimum_Absolute_Difference_in_BST {

    class Solution {
        // List to store the tree nodes in the inorder traversal.
        List<Integer> inorderNodes = new ArrayList<>();

        void inorderTraversal(TreeNode node) {
            if (node == null) {
                return;
            }

            inorderTraversal(node.left);
            // Store the nodes in the list.
            inorderNodes.add(node.val);
            inorderTraversal(node.right);
        }

        int getMinimumDifference(TreeNode root) {
            inorderTraversal(root);

            int minDifference = Integer.MAX_VALUE;
            // Find the diff between every two consecutive values in the list.
            for (int i = 1; i < inorderNodes.size(); i++) {
                minDifference = Math.min(minDifference, inorderNodes.get(i) - inorderNodes.get(i-1));
            }

            return minDifference;
        }
    };


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
