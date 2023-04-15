package Day80;

import java.util.HashMap;

public class Valid_Anagram {
    class Solution {
        public boolean isAnagram(String s, String t) {
            if (s.length() != t.length()) {
                return false;
            }

            HashMap<Character, Integer> hashMap = new HashMap<Character, Integer>();
            for (int i = 0; i < s.length(); i++) {
                hashMap.put(s.charAt(i), hashMap.getOrDefault(s.charAt(i), 0)+1);
                hashMap.put(t.charAt(i), hashMap.getOrDefault(t.charAt(i), 0)-1);
            }

            for (Integer count : hashMap.values()) {
                if (count != 0) {
                    return false;
                }
            }
            return true;
        }
    }
}
