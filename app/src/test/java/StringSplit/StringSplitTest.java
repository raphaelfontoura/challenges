package StringSplit;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class StringSplitTest {

  @Test
  void shouldReturnSize10AndEachWord() {
    String s = "He is a very very good boy, isn't he?";
    String[] expected = { "He", "is", "a", "very", "very", "good", "boy", "isn", "t", "he" };

    var result = Solution.SplitLine(s);

    assertEquals(10, result.length);
    assertArrayEquals(expected, result);
  }

  @Test
  void shouldReturnSize21AndEachWord() {
    String s = "Hello, thanks for attempting this problem! Hope it will help you to learn java! Good luck and have a nice day!";
    String[] expected = {
        "Hello",
        "thanks",
        "for",
        "attempting",
        "this",
        "problem",
        "Hope",
        "it",
        "will",
        "help",
        "you",
        "to",
        "learn",
        "java",
        "Good",
        "luck",
        "and",
        "have",
        "a",
        "nice",
        "day",
    };

    var result = Solution.SplitLine(s);

    assertEquals(21, result.length);
    assertArrayEquals(expected, result);
  }

  @Test
  void shouldReturnSize0AndEmptyArray() {
    String s = "                        ";
    String[] expected = {};

    var result = Solution.SplitLine(s);

    assertEquals(0, result.length);
    assertArrayEquals(expected, result);
  }

}
