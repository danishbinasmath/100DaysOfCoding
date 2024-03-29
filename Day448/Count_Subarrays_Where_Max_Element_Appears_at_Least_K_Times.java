package Day448;

public class Count_Subarrays_Where_Max_Element_Appears_at_Least_K_Times {
    class Solution {
        public long countSubarrays(int[] nums, int k) {
            int maxElement = Arrays.stream(nums).max().getAsInt();
            List<Integer> indexesOfMaxElements = new ArrayList<>();
            long ans = 0;
    
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] == maxElement) {
                    indexesOfMaxElements.add(i);
                }
    
                int freq = indexesOfMaxElements.size();
                if (freq >= k) {
                    ans += indexesOfMaxElements.get(freq - k) + 1;
                }
            }
    
            return ans;
        }
    }
}