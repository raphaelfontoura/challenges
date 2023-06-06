package longestConsecutiveSequence;

import java.util.Arrays;

class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) return 0;
        var sortedNums = Arrays.stream(nums).sorted().toArray();
        var longest = 0;
        var count = 1;
        var number = sortedNums[0];
        for (int point = 1; point < sortedNums.length; point ++) {
            if (sortedNums[point] == number) continue;
            if (sortedNums[point] == ++number) {
                count++;
            } else {
                number = sortedNums[point];
                longest = Math.max(count, longest);
                count = 1;
            }
        }

        return Math.max(count, longest);
    }
}