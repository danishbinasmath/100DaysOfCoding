package Day18;

public class Delete_Node_in_a_BST {
    class Solution {
        public TreeNode deleteNode(TreeNode root, int key) {
            if(root == null) {
                return null;
            }

            //First, searching the element using O(H) Time complexity where H is the height of BST.
            if(key < root.val) {
                root.left = deleteNode(root.left, key);
                return root;
            }else if(key > root.val) {
                root.right = deleteNode(root.right, key);
                return root;

            }else {
                // Case 1: left and right of the node is null.
                if(root.left == null && root.right == null) {
                    return null;
                }

                // Case 2: if any of the two Nodes(i.e left or right) of the Node to be deleted is null.
                if(root.left == null) {
                    return root.right;
                }else if(root.right == null) {
                    return root.left;

                    //Case 3: if the Node to be deleted has two Nodes(i.e left and right is not null).
                }else {
                    TreeNode newNode = root.right;
                    while(newNode.left != null) {
                        newNode = newNode.left;
                    }

                    root.val = newNode.val;
                    root.right = deleteNode(root.right, newNode.val);
                    return root;
                }
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
