package group_anagrams;

import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class SolutionTest {

    @Test
    void groupAnagrams() {
        var solution = new Solution();
        var strs = new String[]{"eat", "tea", "tan", "ate", "nat", "bat"};
        var expected = Arrays.asList(
                List.of("bat"),
                Arrays.asList("nat","tan"),
                Arrays.asList("ate","eat","tea")
        );

        var result = solution.groupAnagrams(strs);

        var firstList = result.stream().filter(list -> list.size() == 1).findFirst().get();
        var secondList = result.stream().filter(list -> list.size() == 2).findFirst().get();
        var thirdList = result.stream().filter(list -> list.size() == 3).findFirst().get();
        assertEquals(expected.size(), result.size());
        assertEquals(expected.get(0), firstList);
        assertEquals(expected.get(1).size(), secondList.size());
        assertEquals(expected.get(2).size(), thirdList.size());
        for (String word : secondList) {
            assertTrue(expected.get(1).contains(word));
        }
        for (String word : thirdList) {
            assertTrue(expected.get(2).contains(word));
        }
    }
}