package Day308;

import java.util.ArrayList;
import java.util.List;

public class Find_Mode_in_Binary_Search_Tree {

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
        int maxStreak = 0;
        int currStreak = 0;
        int currNum = 0;
        List<Integer> ans = new ArrayList<>();

        public int[] findMode(TreeNode root) {
            dfs(root);

            int[] result = new int[ans.size()];
            for (int i = 0; i < ans.size(); i++) {
                result[i] = ans.get(i);
            }

            return result;
        }

        public void dfs(TreeNode node) {
            if (node == null) {
                return;
            }

            dfs(node.left);
            int num = node.val;
            if (num == currNum) {
                currStreak++;
            } else {
                currStreak = 1;
                currNum = num;
            }

            if (currStreak > maxStreak) {
                ans = new ArrayList<>();
                maxStreak = currStreak;
            }

            if (currStreak == maxStreak) {
                ans.add(num);
            }

            dfs(node.right);
        }
    }
}
