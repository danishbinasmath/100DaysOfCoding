package Day166;

import java.util.LinkedList;
import java.util.Queue;

public class Minimum_Depth_of_Binary_Tree {

     class Solution {
          public int minDepth(TreeNode root) {
               if(root == null) {
                    return 0;
               }

               Queue<TreeNode> queue = new LinkedList<>();
               int depth = 1;

               queue.add(root);

               while(!queue.isEmpty()) {
                    int size = queue.size();

                    for(int i = 0; i < size; i++) {
                         TreeNode Node = queue.remove();

                         if(Node == null) {
                              continue;
                         }

                         if(Node.left == null && Node.right == null) {
                              return depth;
                         }

                         queue.add(Node.left);
                         queue.add(Node.right);
                    }
                    depth++;
               }

               return -1;
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
