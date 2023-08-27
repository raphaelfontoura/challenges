package BinarySearch;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class SolutionTest {

  private Solution solution = new Solution();

  @Test
  void case1() {
    var input = new int[]{-1,0,3,5,9,12};
    var target = 9;
    var expected = 4;

    var result = solution.search(input, target);

    assertEquals(expected, result);
  }

  @Test
  void case2() {
    var input = new int[]{-1,0,3,5,9,12};
    var target = 2;
    var expected = -1;

    var result = solution.search(input, target);

    assertEquals(expected, result);
  }
}
