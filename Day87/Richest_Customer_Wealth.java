package Day87;

public class Richest_Customer_Wealth {
    class Solution {
        public int maximumWealth(int[][] accounts) {
            int ans=0;
            for(int i=0;i<accounts.length;i++){
                int sum=0;
                for(int j=0;j<accounts[i].length;j++){
                    sum = sum + accounts[i][j];
                }
                if(sum>ans){
                    ans = sum;
                }
            }
            return ans;

        }
    }
}
