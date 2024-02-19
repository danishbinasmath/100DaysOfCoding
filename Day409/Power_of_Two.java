package Day409;

public class Power_of_Two {
    class Solution {
        public boolean isPowerOfTwo(int n) {
            // Handle edge cases
            if (n == 0 || n == Integer.MIN_VALUE) {
                return false;
            }
            
            //Just use '&' operator on the number(i.e n) with the number-1(i.e n-1), 
            //and if that is equal to 0 then it is a power of 2.
            return (n & (n-1)) == 0;
        }
    }
}