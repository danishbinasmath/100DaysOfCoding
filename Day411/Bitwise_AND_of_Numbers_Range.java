package Day411;

public class Bitwise_AND_of_Numbers_Range {
    class Solution {
        public int rangeBitwiseAnd(int left, int right) {
            int shift = 0;
            while (left < right) {
                left >>= 1;
                right >>= 1;
                shift++;
            }
            return left << shift;
        }
    }
    
}