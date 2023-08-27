package threeSum;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SolutionTest {

  Solution solution = new Solution();

  @Test
  void case1() {
    var input = new int[]{-1,0,1,2,-1,-4};
    var expected = List.of(List.of(-1,-1,2), List.of(-1,0,1));

    var result = solution.threeSum(input);

    System.out.println(result);
    assertEquals(expected.size(), result.size());
  }

  @Test
  void case2() {
    var input = new int[]{0,0,0,0};
    var expected = List.of(List.of(0,0,0));

    var result = solution.threeSum(input);

    System.out.println(result);
    assertEquals(expected.size(), result.size());
  }
}
