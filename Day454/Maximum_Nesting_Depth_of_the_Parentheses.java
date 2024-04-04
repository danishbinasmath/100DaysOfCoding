package Day454;

public class Maximum_Nesting_Depth_of_the_Parentheses {
    class Solution {
        public int maxDepth(String s) {
            int res = 0, cur = 0;
            for (int i = 0; i < s.length(); ++i) {
                if (s.charAt(i) == '(')
                    res = Math.max(res, ++cur);
                if (s.charAt(i) == ')')
                    cur--;
            }
            return res;
        }
    }
}