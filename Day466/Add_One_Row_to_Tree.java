package Day466;

public class Add_One_Row_to_Tree {
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

    class Solution {
        public TreeNode addOneRow(TreeNode root, int val, int depth) {
            if (depth == 1) {
                TreeNode newRoot = new TreeNode(val);
                newRoot.left = root;
                return newRoot;
            }
            addRow(root, val, depth, 1);
            return root;
        }
        
        private void addRow(TreeNode node, int val, int depth, int currentDepth) {
            if (node == null) return;
            
            if (currentDepth == depth - 1) {
                TreeNode leftChild = new TreeNode(val);
                leftChild.left = node.left;
                node.left = leftChild;
                
                TreeNode rightChild = new TreeNode(val);
                rightChild.right = node.right;
                node.right = rightChild;
            } else {
                addRow(node.left, val, depth, currentDepth + 1);
                addRow(node.right, val, depth, currentDepth + 1);
            }
        }
    }
    
}