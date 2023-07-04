package Day160;

import java.util.HashMap;

public class Single_Number_II {
    class Solution {
        public int singleNumber(int[] nums) {
            HashMap<Integer, Integer> map = new HashMap<>();

            int ans = 0;

            for(int a: nums) {
                if(map.containsKey(a)) {
                    map.put(a, map.get(a) + 1);
                }else {
                    map.put(a, 1);
                }
            }

            for(int a : nums) {
                if(map.get(a) != null && map.get(a) == 1) {
                    ans = a;
                }
            }

            return ans;
        }
    }
}
