package RomanToInteger;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class SolutionTest {

    @ParameterizedTest
    @CsvSource(value = {"III,3", "LVIII,58", "MCMXCIV,1994"})
    public void romanToIntegerTest(String input, int expected) {
        Solution solution = new Solution();

        int result = solution.romanToInt(input);

        Assertions.assertEquals(expected, result);
    }
}