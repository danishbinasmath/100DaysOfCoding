package Day25;

public class Length_of_Last_Word {
    class Solution {
        public int lengthOfLastWord(String s) {
            int length = 0;

            for(int i = s.length() - 1; i >= 0; i--) {
                if(s.charAt(i) != ' ') {
                    length++;
                }else {
                    if(length > 0) return length;
                }
            }

            return length;

        }
    }
}
