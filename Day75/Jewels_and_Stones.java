package Day75;

import java.util.HashSet;
import java.util.Set;

public class Jewels_and_Stones {
    class Solution {
        public int numJewelsInStones(String jewels, String stones) {
            Set<Character> s = new HashSet<>();

            int count = 0;

            for(char a: jewels.toCharArray()) {
                s.add(a);
            }

            for(char b: stones.toCharArray()) {
                if(s.contains(b)) {
                    count++;
                }
            }

            return count;
        }
    }
}
