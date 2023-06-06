package longestConsecutiveSequence;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    Solution solution = new Solution();

    @Test
    void longestConsecutive_case1() {
        var input = new int[]{100,4,200,1,3,2};
        var output = 4;

        var result = solution.longestConsecutive(input);

        assertEquals(output, result);
    }

    @Test
    void longestConsecutive_case2() {
        var input = new int[]{0,3,7,2,5,8,4,6,0,1};
        var output = 9;

        var result = solution.longestConsecutive(input);

        assertEquals(output, result);
    }

    @Test
    void longestConsecutive_case3() {
        var input = new int[]{};
        var output = 0;

        var result = solution.longestConsecutive(input);

        assertEquals(output, result);
    }

    @Test
    void longestConsecutive_case4() {
        var input = new int[]{1,2,0,1};
        var output = 3;

        var result = solution.longestConsecutive(input);

        assertEquals(output, result);
    }
}
