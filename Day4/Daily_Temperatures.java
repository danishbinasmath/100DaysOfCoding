package Day4;

import java.util.Arrays;
import java.util.Stack;

public class Daily_Temperatures {
    public static void main(String[] args) {
        int[] ans = {73,74,75,71,69,72,76,73};
        System.out.println(Arrays.toString(dailyTemperatures(ans)));
    }

    public static int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> stack = new Stack<Integer>();
        int[] ans = new int[temperatures.length];
        for(int i = 0; i < temperatures.length; i++) {
            while(!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()]){
                int index = stack.pop();
                ans[index] = i - index;
            }
            stack.push(i);
        }
        return ans;
    }
}
