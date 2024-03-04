package Day423;

import java.util.Arrays;

public class Bag_of_Tokens {
    class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {
        Arrays.sort(tokens);
        int points = 0;
        int maxPoints = 0;
        int i = 0;
        int j = tokens.length - 1;

        while(i <= j) {
            if(power >= tokens[i]) {
                points++;
                power = power - tokens[i];
                i++;
                maxPoints = Math.max(maxPoints, points);
            }else if(points > 0) {
                points--;
                power = power + tokens[j];
                j--;
                maxPoints = Math.max(maxPoints, points);
            }else {
                return maxPoints;
            }
        }

        return maxPoints;
    }
}
}