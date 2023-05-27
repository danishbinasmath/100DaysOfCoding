package Day122;

public class Stone_Game_III {
    class Solution {
        public String stoneGameIII(int[] A) {
            int n = A.length, dp[] = new int[4];
            for (int i = n - 1; i >= 0; --i) {
                dp[i % 4] = Integer.MIN_VALUE;
                for (int k = 0, take = 0; k < 3 && i + k < n; ++k) {
                    take += A[i + k];
                    dp[i % 4] = Math.max(dp[i % 4], take - dp[(i + k + 1) % 4]);
                }
            }
            if (dp[0] > 0) return "Alice";
            if (dp[0] < 0) return "Bob";
            return "Tie";
        }
    }
}
