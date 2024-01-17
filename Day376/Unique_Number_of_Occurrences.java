package Day376;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Unique_Number_of_Occurrences {
    class Solution {
        public boolean uniqueOccurrences(int[] arr) {
            HashMap<Integer, Integer> map = new HashMap<>();
            for(int a: arr) {
                map.put(a, map.getOrDefault(a, 0) + 1);
            }
    
            boolean Result = true;
    
            HashSet<Integer> set = new HashSet<>();
    
            for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
                if(set.contains(entry.getValue())) {
                    Result = false;
                }
                set.add(entry.getValue());
            }
    
            return Result;
        }
    }
}