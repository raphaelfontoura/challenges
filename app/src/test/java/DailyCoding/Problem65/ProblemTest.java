package DailyCoding.Problem65;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ProblemTest {

    private Problem problem;

    @BeforeEach
    void setUp() {
        problem = new Problem();
    }

    @Test
    void firstCase() {
        int[][] numbers = {{1,2},{3,4}};
        List<Integer> expected = Arrays.asList(1,2,4,3);

        List<Integer> result = problem.getClockwiseSpiral(numbers);
        assertEquals(expected, result);
    }

    @Test
    void secondCase() {
        int[][] numbers = {{1,2},{3,4},{5,6}};
        List<Integer> expected = Arrays.asList(1,2,4,6,5,3);

        List<Integer> result = problem.getClockwiseSpiral(numbers);
        assertEquals(expected, result);
    }
    @Test
    void thirdCase() {
        int[][] numbers = {{1,2,3},{4,5,6}};
        List<Integer> expected = Arrays.asList(1,2,3,6,5,4);

        List<Integer> result = problem.getClockwiseSpiral(numbers);
        assertEquals(expected, result);

    }

    @Test
    void fourCase() {
        int[][] numbers = {{1, 2, 3}, {6, 7, 8}, {11, 12, 13}};
        List<Integer> expected = Arrays.asList(1,2,3,8,13,12,11,6,7);

        List<Integer> result = problem.getClockwiseSpiral(numbers);
        assertEquals(expected, result);

    }

    @Test
    void fiveCase() {
        int[][] numbers = {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20}};

        List<Integer> expected = Arrays.asList(1,2,3,4,5,10,15,20,19,18,17,16,11,6,7,8,9,14,13,12);

        List<Integer> result = problem.getClockwiseSpiral(numbers);
        assertEquals(expected, result);
    }
}