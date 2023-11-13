import java.util.AbstractMap.SimpleEntry;

public class Count_Nodes_Equal_to_Average_of_Subtree {

    // Definition for a binary tree node.
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    class Solution {
        int count = 0;

        SimpleEntry<Integer, Integer> postOrder(TreeNode root) {
            if (root == null) {
                return new SimpleEntry<>(0, 0);
            }

            // First iterate over left and right subtrees.
            SimpleEntry<Integer, Integer> left = postOrder(root.left);
            SimpleEntry<Integer, Integer> right = postOrder(root.right);

            int nodeSum = left.getKey() + right.getKey() + root.val;
            int nodeCount = left.getValue() + right.getValue() + 1;

            // Check if the average of the subtree is equal to the node value.
            if (root.val == nodeSum / (nodeCount)) {
                count++;
            }

            // Return the sum of nodes and the count in the subtree.
            return new SimpleEntry<>(nodeSum, nodeCount);
        }

        public int averageOfSubtree(TreeNode root) {
            postOrder(root);
            return count;
        }
    }
}
