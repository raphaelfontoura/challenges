package ProductArrayExceptSelf;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void productExceptSelf_case1() {
        var input = new int[]{1,2,3,4};
        var expected = new int[]{24,12,8,6};

        var result = solution.productExceptSelf(input);

        assertArrayEquals(expected, result);
    }

    @Test
    void productExceptSelf_case2() {
        var input = new int[]{-1,1,0,-3,3};
        var expected = new int[]{0,0,9,0,0};

        var result = solution.productExceptSelf(input);

        assertArrayEquals(expected, result);
    }
}