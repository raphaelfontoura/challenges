package reversePolishNotation;

import java.util.Stack;

public class Solution {
    public int evalRPN(String[] tokens) {
        var stack = new Stack<Integer>();

        for (String token : tokens) {

            switch (token) {
                case "+" -> stack.push(stack.pop() + stack.pop());
                case "-" -> {
                    var num = stack.pop();
                    stack.push(stack.pop() - num);
                }
                case "*" -> stack.push(stack.pop() * stack.pop());
                case "/" -> {
                    var num = stack.pop();
                    stack.push(stack.pop() / num);
                }
                default -> stack.push(Integer.parseInt(token));
            }
        }

        return stack.pop();
    }
}
