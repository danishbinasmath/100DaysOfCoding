package Day54;

public class Fibonacci_Number {
    class Solution {
        public int fib(int n) {
            if(n<2){
                return n;
            }
            return fib(n-1) + fib(n-2);
        }
    }
}
