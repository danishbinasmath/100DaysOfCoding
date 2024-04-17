package Day467;

public class Smallest_String_Starting_From_Leaf {
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
            public String smallestFromLeaf(TreeNode root) {
                String smallestString = "";
                Queue<Pair<TreeNode, String>> nodeQueue = new LinkedList<>();
        
                // Add root node to queue along with its value converted to a character
                nodeQueue.add(new Pair<>(root, String.valueOf((char)(root.val + 'a'))));
        
                // Perform BFS traversal until queue is empty
                while (!nodeQueue.isEmpty()) {
        
                    // Pop the leftmost node and its corresponding string from queue
                    Pair<TreeNode, String> pair = nodeQueue.poll();
                    TreeNode node = pair.getKey();
                    String currentString = pair.getValue();
            
                    // If current node is a leaf node
                    if (node.left == null && node.right == null) {
                    
                        // Update smallest_string if it's empty or current string is smaller
                        if (smallestString.isEmpty()) {
                            smallestString = currentString;
                        } else {
                            smallestString = currentString.compareTo(smallestString) < 0 ? currentString : smallestString;
                        }
                    }
        
                    // If current node has a left child, append it to queue
                    if (node.left != null) {
                        nodeQueue.add(new Pair<>(node.left, (char)(node.left.val + 'a') + currentString));
                    }
        
                    // If current node has a right child, append it to queue
                    if (node.right != null) {
                        nodeQueue.add(new Pair<>(node.right, (char)(node.right.val + 'a') + currentString));
                    }
                }
        
                return smallestString;
            }
        }
        
}