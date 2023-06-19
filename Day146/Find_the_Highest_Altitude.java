package Day146;

public class Find_the_Highest_Altitude {
    class Solution {
        public int largestAltitude(int[] gain) {
            int ans = 0, max = 0;
            for(int a: gain) {
                ans = ans + a;
                if(max < ans) {
                    max = ans;
                }
            }

            return max;
        }
    }
}
