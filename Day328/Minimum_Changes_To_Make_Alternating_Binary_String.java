package Day328;

public class Minimum_Changes_To_Make_Alternating_Binary_String {
    class Solution {
        public int minOperations(String s) {
            int res = 0, n = s.length();
            for (int i = 0; i < n; ++i)
                if (s.charAt(i) - '0' != i % 2)
                    res++;
            return Math.min(res, n - res);
        }
    }
}