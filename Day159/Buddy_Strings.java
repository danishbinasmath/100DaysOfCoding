package Day159;

import java.util.*;

public class Buddy_Strings {
    class Solution {
        public boolean buddyStrings(String s, String goal) {
            if(s.length() != goal.length()) {
                return false;
            }

            if(s.equals(goal)) {
                Set<Character> set = new HashSet<Character>();
                for(char ch: s.toCharArray()) set.add(ch);
                return set.size() < goal.length();
            }

            List<Integer> diff = new ArrayList<>();
            for(int i = 0; i < s.length(); ++i) if(s.charAt(i) != goal.charAt(i)) diff.add(i);
            return diff.size() == 2 && s.charAt(diff.get(0)) == goal.charAt(diff.get(1)) && goal.charAt(diff.get(0)) == s.charAt(diff.get(1));

        }
    }
}
