package Day260;

import java.util.HashSet;

public class Minimum_Deletions_to_Make_Character_Frequencies_Unique {
    class Solution {
        public int minDeletions(String s) {
            int count[] = new int[26];

            for(char ch: s.toCharArray()) {
                count[ ch - 'a']++;
            }

            HashSet<Integer> set = new HashSet<>();

            int deletion = 0;

            for(int val: count) {
                while(val != 0 && set.contains(val)) {
                    val--;
                    deletion++;
                }

                set.add(val);
            }
            return deletion;
        }
    }
}
