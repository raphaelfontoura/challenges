package ValidPalindrome;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SolutionTest {

    Solution solution = new Solution();

    @Test
    public void case1() {
        String input = "A man, a plan, a canal: Panama";

        Assertions.assertTrue(solution.isPalindrome(input));
    }

    @Test
    public void case2() {
        String input = "race a car";

        Assertions.assertFalse(solution.isPalindrome(input));
    }

    @Test
    public void case3() {
        String input = " ";

        Assertions.assertTrue(solution.isPalindrome(input));
    }
}
