package Day444;

public class Find_All_Duplicates_in_an_Array {
    class Solution {
        public List<Integer> findDuplicates(int[] nums) {
            HashSet<Integer> set = new HashSet<>();
            List<Integer> result = new ArrayList<>();
    
            for(int num : nums) {
                if(!set.add(num)) {
                    result.add(num);
                }
            }
    
            return result;
        }
    }
}