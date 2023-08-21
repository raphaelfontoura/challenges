package TwoSumIIArraySorted;

import java.util.Arrays;

public class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int firstPos = 0;
        int secondPos = numbers.length -1;
        while (firstPos != secondPos) {
            int result = numbers[firstPos] + numbers[secondPos];
            if (result == target) {
                break;
            } else if (result > target) {
                secondPos--;
            } else {
                firstPos++;
            }
        }
        return new int[]{firstPos+1, secondPos+1};
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        var result = solution.twoSum(new int[]{2,7,11,15}, 9);
        System.out.println(Arrays.toString(result));

        var result2 = solution.twoSum(new int[]{2,3,4}, 6);
        System.out.println(Arrays.toString(result2));

        var result3 = solution.twoSum(new int[]{-1,0}, -1);
        System.out.println(Arrays.toString(result3));

        var result4 = solution.twoSum(new int[]{5,25,75}, 100);
        System.out.println(Arrays.toString(result4));
    }
}
