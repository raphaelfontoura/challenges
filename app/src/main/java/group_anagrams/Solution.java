package group_anagrams;

import java.util.*;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>();
        Map<String, Integer> tempSet = new HashMap<>();
        var position = 0;
        for (String word : strs) {
            var charArray = word.toCharArray();
            Arrays.sort(charArray);
            var orderedWord = new String(charArray);
            if (!tempSet.containsKey(orderedWord)) {
                tempSet.put(orderedWord, position);
                result.add(new ArrayList<>());
                result.get(position).add(word);
                position++;
            } else {
                var positionActual = tempSet.get(orderedWord);
                result.get(positionActual).add(word);
            }
        }
        return result;
    }

}