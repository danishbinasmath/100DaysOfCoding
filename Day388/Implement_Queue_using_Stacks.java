import java.util.Stack;

public class Implement_Queue_using_Stacks {
class MyQueue {
    private Stack<Integer> st1;
    private Stack<Integer> st2;

    public MyQueue() {
        st1 = new Stack<>();
        st2 = new Stack<>();
    }

    public void push(int x) {
        while (!st1.empty()) {
            st2.push(st1.pop());
        }
        st1.push(x);
        while (!st2.empty()) {
            st1.push(st2.pop());
        }
    }

    public int pop() {
        return st1.pop();
    }

    public int peek() {
        return st1.peek();
    }

    public boolean empty() {
        return st1.empty();
    }
}
}
