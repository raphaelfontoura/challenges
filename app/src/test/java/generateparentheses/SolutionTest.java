package generateparentheses;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertLinesMatch;
import static org.junit.jupiter.api.Assertions.assertTrue;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void generateParenthesis_case1() {
        var input = 3;
        var output = List.of("((()))", "(()())", "(())()", "()(())","()()()");

        var result = solution.generateParenthesis(input);

        assertTrue(output.contains(result.get(0)));
        assertTrue(output.contains(result.get(1)));
        assertTrue(output.contains(result.get(2)));
        assertTrue(output.contains(result.get(3)));
        assertTrue(output.contains(result.get(4)));

    }

    @Test
    void generateParenthesis_case2() {
        var input = 1;
        var output = List.of("()");

        var result = solution.generateParenthesis(input);

        assertLinesMatch(output, result);
    }

    @Test
    void generateParenthesis_case3() {
        var input = 2;
        var output = List.of("()()", "(())");

        var result = solution.generateParenthesis(input);

        assertTrue(output.contains(result.get(0)));
        assertTrue(output.contains(result.get(1)));
    }
}