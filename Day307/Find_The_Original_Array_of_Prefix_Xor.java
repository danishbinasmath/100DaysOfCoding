public class Find_The_Original_Array_of_Prefix_Xor {
    class Solution {
        public int[] findArray(int[] pref) {
            int n = pref.length;
    
            for (int i = n - 1; i > 0; i--) {
                pref[i] = pref[i] ^ pref[i - 1];
            }
    
            return pref;
        }
    }
}
