package reversePolishNotation;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    Solution solution = new Solution();

    @Test
    void evalRPN_case1() {
        var input =  new String[]{"2","1","+","3","*"};
        var output = 9;

        var result = solution.evalRPN(input);

        assertEquals(output, result);
    }

    @Test
    void evalRPN_case2() {
        var input =  new String[]{"4","13","5","/","+"};
        var output = 6;

        var result = solution.evalRPN(input);

        assertEquals(output, result);
    }
}