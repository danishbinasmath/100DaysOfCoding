package Day3;

import java.util.Stack;

public class Valid_Parentheses {
    class Solution {
        public boolean isValid(String s) {
            Stack<Character> stack = new Stack<Character>();
            // for(int i = 0; i < s.length; i++)
            for(char ch: s.toCharArray()) {
                // char ch = s.chatAt(i)
                if(ch == '(' || ch == '[' || ch == '{') stack.push(ch);
                else if(stack.isEmpty()) return false;
                else if(ch == ')' && stack.pop() != '(') return false;
                else if(ch == ']' && stack.pop() != '[') return false;
                else if(ch == '}' && stack.pop() != '{') return false;
            }
            return stack.isEmpty();
        }
    }
}
