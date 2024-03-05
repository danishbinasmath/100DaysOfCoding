package Day424;

public class Minimum_Length_of_String_After_Deleting_Similar_Ends_Solved_Medium_Topics {
    class Solution {
        public int minimumLength(String s) {
            int left = 0;
            int right = s.length() - 1;
            
            while(left < right && s.charAt(left) == s.charAt(right)) {
                char ch = s.charAt(left);
    
                while(left <= right && s.charAt(left) == ch) {
                    left++;
                }
    
                while(left <= right && s.charAt(right) == ch) {
                    right--;
                }
    
            }
    
            return Math.max(0, right - left + 1);
        }
    }
}