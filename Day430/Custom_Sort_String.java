package Day430;

import java.util.HashMap;

public class Custom_Sort_String {
    class Solution {
        public String customSortString(String order, String s) {
            StringBuilder result = new StringBuilder();
            HashMap<Character, Integer> map = new HashMap<>();
    
            //Count the frequencies
            for(char ch : s.toCharArray()) {
                map.put(ch, map.getOrDefault(ch, 0) + 1);
            }
    
            //Append the character in the stringbuilder according to the string named order
            for(int i = 0; i < order.length(); i++) {
                char ch = order.charAt(i);
                if(map.containsKey(ch)) {
                    for(int j = 0; j < map.get(ch); j++) {
                        result.append(ch);
                    }
                    map.remove(ch);
                }
            }
    
            //Append the remaining characters that are not in the string named order
            for(char ch : map.keySet()) {
                for(int i = 0; i < map.get(ch); i++) {
                    result.append(ch);
                }
            }
    
            return result.toString();
        }
    }
}