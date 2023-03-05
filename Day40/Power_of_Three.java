package Day40;

public class Power_of_Three {
    class Solution {
        public boolean isPowerOfThree(int n) {
            return n > 0 && (n == 1 || (n%3 == 0 && isPowerOfThree(n/3)));
        }
    }

}
