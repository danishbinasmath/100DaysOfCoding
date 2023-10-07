package Day285;

public class Build_Array_Where_You_Can_Find_The_Maximum_Exactly_K_Comparisons {
    class Solution {
        public int numOfArrays(int n, int m, int k) {
            long[][] dp = new long[m + 1][k + 1];
            long[][] prefix = new long[m + 1][k + 1];
            long[][] prevDp = new long[m + 1][k + 1];
            long[][] prevPrefix = new long[m + 1][k + 1];
            int MOD = (int) 1e9 + 7;
            
            for (int num = 1; num <= m; num++) {
                dp[num][1] = 1;
            }
            
            for (int i = 1; i <= n; i++) {
                if (i > 1) {
                    dp = new long[m + 1][k + 1];
                }
                
                prefix = new long[m + 1][k + 1];
                
                for (int maxNum = 1; maxNum <= m; maxNum++) {
                    for (int cost = 1; cost <= k; cost++) {
                        long ans = (maxNum * prevDp[maxNum][cost]) % MOD;
                        ans = (ans + prevPrefix[maxNum - 1][cost - 1]) % MOD;
    
                        dp[maxNum][cost] += ans;
                        dp[maxNum][cost] %= MOD;
                        
                        prefix[maxNum][cost] = (prefix[maxNum - 1][cost] + dp[maxNum][cost]);
                        prefix[maxNum][cost] %= MOD;
                    }
                }
                
                prevDp = dp;
                prevPrefix = prefix;
            }
            
            return (int) prefix[m][k];
        }
    }
}
