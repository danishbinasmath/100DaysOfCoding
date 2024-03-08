package Day427;

public class Count_Elements_With_Maximum_Frequency {
    class Solution {
        public int maxFrequencyElements(int[] nums) {
            HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
            int maxFreq = 0;
    
            for(int num : nums) {
                int freq = map.getOrDefault(num, 0) + 1;
                map.put(num, freq);
                maxFreq = Math.max(maxFreq, freq);
            }
    
            int totalFreq = 0;
            for(int key : map.keySet()) {
                if(maxFreq == map.get(key)) {
                    totalFreq = totalFreq + maxFreq;
                }
            }
    
            return totalFreq;
        }
    }
}