package stack;

import java.util.*;

public class MinStack {
    private Stack<Integer> stack;
    private Stack<Integer> minStack;

    public MinStack() {
        stack = new Stack<>();
        minStack = new Stack<>();
    }

    public void push(int val) {
        stack.push(val);

        if (minStack.isEmpty() || val <= minStack.peek()) {
            minStack.push(val);
        }
    }

    public void pop() {
        int popped = stack.pop();

        if (popped == minStack.peek()) {
            minStack.pop();
        }
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return minStack.peek();
    }

    public static void main(String[] args) {

        System.out.println("Case 1");
        var teste = new MinStack();
        case1(teste);
        System.out.println("Case 2");
        teste = new MinStack();
        case2(teste);

    }

    private static void case2(MinStack teste) {
        teste.push(0);
        teste.push(1);
        teste.push(0);
        System.out.println(teste.getMin());
        teste.pop();
        System.out.println(teste.getMin());
    }

    private static void case1(MinStack teste) {
        teste.push(-2);
        teste.push(0);
        teste.push(-3);
        System.out.println(teste.getMin());

        teste.pop();
        System.out.println(teste.top());

        System.out.println(teste.getMin());
    }
}
