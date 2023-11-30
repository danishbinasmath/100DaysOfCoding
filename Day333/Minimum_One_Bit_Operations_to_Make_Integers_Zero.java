package Day333;

public class Minimum_One_Bit_Operations_to_Make_Integers_Zero {
    class Solution {
        public int minimumOneBitOperations(int n) {
            int ans = n;
            ans ^= ans >> 16;
            ans ^= ans >> 8;
            ans ^= ans >> 4;
            ans ^= ans >> 2;
            ans ^= ans >> 1;
            return ans;
        }
    }
}
