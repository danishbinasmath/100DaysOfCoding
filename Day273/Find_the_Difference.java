package Day273;

public class Find_the_Difference {
    class Solution {
        public char findTheDifference(String s, String t) {
            char c = 0;

            for (char cs : s.toCharArray()) {
                // c = (char)(c ^ cs);
                c ^= cs;
            }

            for (char ct : t.toCharArray()) {
                // c = (char)(c ^ ct);
                c ^= ct;
            }

            return c;
        }
    }
}
