import java.util.Stack;

public class Maximal_Rectangle {
    class Solution {
        public int maximalRectangle(char[][] matrix) {
            if (matrix == null || matrix.length == 0 || matrix[0].length == 0) return 0;
            
            int maxArea = 0;
            int[] heights = new int[matrix[0].length];
            
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[0].length; j++) {
                    heights[j] = (matrix[i][j] == '1') ? heights[j] + 1 : 0;
                }
                maxArea = Math.max(maxArea, largestRectangleArea(heights));
            }
            
            return maxArea;
        }
        
        private int largestRectangleArea(int[] heights) {
            Stack<Integer> stack = new Stack<>();
            int maxArea = 0;
            
            for (int i = 0; i <= heights.length; i++) {
                int h = (i == heights.length) ? 0 : heights[i];
                if (stack.isEmpty() || h >= heights[stack.peek()]) {
                    stack.push(i);
                } else {
                    int top = stack.pop();
                    maxArea = Math.max(maxArea, heights[top] * (stack.isEmpty() ? i : i - stack.peek() - 1));
                    i--;
                }
            }
            
            return maxArea;
        }
    }
}