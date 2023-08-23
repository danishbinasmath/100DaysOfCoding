package Day210;

public class Reorganize_String {
    /*
       Approach
        1.count letter appearance and store in hash[i]
        2.find the letter with the largest occurrence.
        3.put the letter into even index number (0, 2, 4 ...) char array
        4.put the rest into the array

        Time O(N): fill hash[] + find the letter + write results into char array
        Space O(N + 26): result + hash[]
     */
    class Solution {
        public String reorganizeString(String S) {
            int[] hash = new int[26];
            for (int i = 0; i < S.length(); i++) {
                hash[S.charAt(i) - 'a']++;
            }
            int max = 0, letter = 0;
            for (int i = 0; i < hash.length; i++) {
                if (hash[i] > max) {
                    max = hash[i];
                    letter = i;
                }
            }
            if (max > (S.length() + 1) / 2) {
                return "";
            }
            char[] res = new char[S.length()];
            int idx = 0;
            while (hash[letter] > 0) {
                res[idx] = (char) (letter + 'a');
                idx += 2;
                hash[letter]--;
            }
            for (int i = 0; i < hash.length; i++) {
                while (hash[i] > 0) {
                    if (idx >= res.length) {
                        idx = 1;
                    }
                    res[idx] = (char) (i + 'a');
                    idx += 2;
                    hash[i]--;
                }
            }
            return String.valueOf(res);
        }
    }

}
