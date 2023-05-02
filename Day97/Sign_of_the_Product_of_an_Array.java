package Day97;

public class Sign_of_the_Product_of_an_Array {
    class Solution {
        public int arraySign(int[] nums) {
            int sign = 1;
            for (int n : nums) {
                if (n == 0) {
                    return 0;
                }
                if (n < 0) {
                    sign = -sign;
                }
            }
            return sign;
        }
    }
}
