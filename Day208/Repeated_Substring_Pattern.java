package Day208;

public class Repeated_Substring_Pattern {
    class Solution {
        public boolean repeatedSubstringPattern(String s) {
            String t = s + s;
            if (t.substring(1, t.length() - 1).contains(s))
                return true;
            return false;
        }
    }
}
