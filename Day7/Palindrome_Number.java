package Day7;

public class Palindrome_Number {
    class Solution {
        public boolean isPalindrome(int x) {
            int og = x;
            int rev = 0;
            while(x>0){
                rev = x%10 + rev*10;
                x = x/10;
            }
            return rev==og;
        }
    }
}
