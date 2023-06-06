package stack;

import java.util.*;

public class MinStack {
    private Stack<Integer> stack;
    private PriorityQueue<Integer> min;


    public MinStack() {
        stack = new Stack<>();
        min = new PriorityQueue<>();
    }

    public void push(int val) {
        stack.push(val);
        min.add(val);
    }

    public void pop() {
        var popNum = stack.pop();
        min.remove(popNum);
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return min.peek();
    }

    public static void main(String[] args) {
        var teste = new MinStack();

        case1(teste);
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
