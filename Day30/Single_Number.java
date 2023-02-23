package Day30;

public class Single_Number {
    class Solution {
        public int singleNumber(int[] nums) {
            int unique = 0;
            for(int num: nums) {
                unique = unique ^ num;
            }
            return unique;
        }
    }
}
