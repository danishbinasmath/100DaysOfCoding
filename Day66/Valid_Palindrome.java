package Day66;

public class Valid_Palindrome {
    public class Solution {
        public boolean isPalindrome(String s) {
            String actual = s.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
            String rev = new StringBuffer(actual).reverse().toString();
            return actual.equals(rev);
        }
    }
}
