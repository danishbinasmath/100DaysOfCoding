package Day327;

import java.util.Arrays;

public class Maximum_Number_of_Coins_You_Can_Get {
    class Solution {
    public int maxCoins(int[] piles) {
        Arrays.sort(piles);
        int ans = 0;
        
        for (int i = piles.length / 3; i < piles.length; i += 2) {
            ans += piles[i];
        }
        
        return ans;
    }
}
}