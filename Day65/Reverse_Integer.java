package Day65;

public class Reverse_Integer {
    class Solution {
        public int reverse(int x) {
            int reverse = 0;
            int pop;

            //We are reversing the integer and storing in reverse
            while(x != 0) {
                pop = x%10; //getting the last value
                x = x/10; //removing the last value

                //Check the limits
                if(reverse > Integer.MAX_VALUE || reverse == Integer.MAX_VALUE && reverse > 7) return 0;
                if(reverse < Integer.MIN_VALUE || reverse == Integer.MAX_VALUE && reverse < -8) return 0;

                reverse = (reverse * 10) + pop;
            }

            return reverse;

        }
    }
}
