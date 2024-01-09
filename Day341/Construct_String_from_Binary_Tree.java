package Day341;

public class Construct_String_from_Binary_Tree {

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

    public class Solution {
        public String tree2str(TreeNode t) {
            if (t == null)
                return "";

            String result = t.val + "";

            String left = tree2str(t.left);
            String right = tree2str(t.right);

            if (left == "" && right == "")
                return result;
            if (left == "")
                return result + "()" + "(" + right + ")";
            if (right == "")
                return result + "(" + left + ")";
            return result + "(" + left + ")" + "(" + right + ")";
        }
    }
}