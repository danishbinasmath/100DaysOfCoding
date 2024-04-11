package Day461;

import java.util.Stack;

public class Remove_K_Digits {
    class Solution {
        public String removeKdigits(String num, int k) {
            // If k is equal to the length of the number, return "0"
            if (k == num.length()) return "0";
            
            Stack<Character> stack = new Stack<>();
            
            // Iterate through each digit in the number
            for (char digit : num.toCharArray()) {
                // Remove digits from the stack while k is greater than 0
                while (!stack.isEmpty() && k > 0 && stack.peek() > digit) {
                    stack.pop();
                    k--;
                }
                stack.push(digit);
            }
            
            // Remove remaining digits from the stack if k is still greater than 0
            while (k > 0) {
                stack.pop();
                k--;
            }
            
            // Construct the result string
            StringBuilder sb = new StringBuilder();
            while (!stack.isEmpty()) {
                sb.insert(0, stack.pop());
            }
            
            // Remove leading zeros
            while (sb.length() > 1 && sb.charAt(0) == '0') {
                sb.deleteCharAt(0);
            }
            
            return sb.toString();
        }
    }
    
}