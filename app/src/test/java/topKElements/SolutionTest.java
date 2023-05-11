package topKElements;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void topKFrequent_case1() {
        int[] output = {1,2};
        int[] input = {1,1,1,2,2,3};
        int k = 2;
        Solution solution = new Solution();

        var result = solution.topKFrequent(input, k);

        assertArrayEquals(output, result);
    }

    @Test
    void topKFrequent_case2() {
        int[] output = {1};
        int[] input = {1};
        int k = 1;
        Solution solution = new Solution();

        var result = solution.topKFrequent(input, k);

        assertArrayEquals(output, result);
    }

    @Test
    void topKFrequent_case3() {
        int[] output = {1,2};
        int[] input = {1,2};
        int k = 2;
        Solution solution = new Solution();

        var result = solution.topKFrequent(input, k);

        Arrays.sort(result);
        assertArrayEquals(output, result);
    }

    @Test
    void topKFrequent_case4() {
        int[] output = {0};
        int[] input = {3,0,1,0};
        int k = 1;
        Solution solution = new Solution();

        var result = solution.topKFrequent(input, k);

        assertArrayEquals(output, result);
    }

    @Test
    void topKFrequent_case5() {
        int[] output = {3,4};
        int[] input = {3,3,3,4,4,1};
        int k = 2;
        Solution solution = new Solution();

        var result = solution.topKFrequent(input, k);

        assertArrayEquals(output, result);
    }

    @Test
    void topKFrequent_case6() {
        int[] output = {3,4};
        int[] input = {4,3,3,4,4,1};
        int k = 2;
        Solution solution = new Solution();

        var result = solution.topKFrequent(input, k);

        Arrays.sort(result);
        assertArrayEquals(output, result);
    }
}