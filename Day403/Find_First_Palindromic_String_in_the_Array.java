package Day403;

public class Find_First_Palindromic_String_in_the_Array {
    class Solution {
        public String firstPalindrome(String[] words) {
            for(String str : words) {
                if(isPalindrome(str)) {
                    return str;
                }
            }
            return "";
        }
    
        public boolean isPalindrome(String str) {
            char[] ch = str.toCharArray();
            int last = ch.length-1;
            for(int i = 0; i < str.length()/2; i++) {
                if(ch[i] != ch[last]) {
                    return false;
                }
                last--;
            }
            return true;
        }
    }
}