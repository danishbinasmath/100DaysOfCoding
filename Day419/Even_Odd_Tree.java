package Day419;

import java.util.ArrayList;
import java.util.List;

public class Even_Odd_Tree {
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

    public class Solution {
    private List<Integer> prev = new ArrayList<>();

    public boolean isEvenOddTree(TreeNode root) {
        TreeNode current = root;
        return dfs(current, 0);
    }

    private boolean dfs(TreeNode current, int level) {
        // Base case, an empty tree is Even-Odd
        if (current == null) {
            return true;
        }

        // Compare the parity of current and level
        if (current.val % 2 == level % 2) {
            return false;
        }

        // Add a new level to prev if we've reached a new level
        while (prev.size() <= level) {
            prev.add(0);
        }

        // If there are previous nodes on this level, check increasing/decreasing
        // If on an even level, check that current's value is greater than the previous on this level
        // If on an odd level, check that current's value is less than the previous on this level
        if (prev.get(level) != 0 && 
                ((level % 2 == 0 && current.val <= prev.get(level)) || 
                 (level % 2 == 1 && current.val >= prev.get(level)))) {
            return false;
        }

        // Add current value to prev at index level
        prev.set(level, current.val);

        // Recursively call DFS on the left and right children
        return dfs(current.left, level + 1) && dfs(current.right, level + 1);
    }
}

}
