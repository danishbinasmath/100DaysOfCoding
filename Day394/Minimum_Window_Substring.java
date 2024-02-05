package Day394;

import java.util.HashMap;
import java.util.Map;

public class Minimum_Window_Substring {

class Solution {
    public String minWindow(String s, String t) {
        if (s == null || t == null || s.length() == 0 || t.length() == 0 || s.length() < t.length())
            return "";

        Map<Character, Integer> targetMap = new HashMap<>();
        for (char c : t.toCharArray()) {
            targetMap.put(c, targetMap.getOrDefault(c, 0) + 1);
        }

        int left = 0; 
        int minLeft = 0; 
        int minLen = s.length() + 1; 
        int count = 0; 

        for (int right = 0; right < s.length(); right++) {
            char c = s.charAt(right);

            if (targetMap.containsKey(c)) {
                targetMap.put(c, targetMap.get(c) - 1);
                if (targetMap.get(c) >= 0) {
                    count++; 
                }

                while (count == t.length()) {
                    if (right - left + 1 < minLen) {
                        minLeft = left;
                        minLen = right - left + 1;
                    }

                    char leftChar = s.charAt(left);
                    if (targetMap.containsKey(leftChar)) {
                        targetMap.put(leftChar, targetMap.get(leftChar) + 1);
                        if (targetMap.get(leftChar) > 0) {
                            count--; 
                        }
                    }

                    left++; 
                }
            }
        }

        return minLen == s.length() + 1 ? "" : s.substring(minLeft, minLeft + minLen);
    }
}

}