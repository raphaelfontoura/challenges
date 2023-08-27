package threeSum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

class Solution {

    public List<List<Integer>> threeSum(int[] nums) {
        var result = new HashSet<List<Integer>>();
        Arrays.sort(nums);
        var i = 0;
        var j = i + 1;
        var k = nums.length -1;
        while(i <= nums.length-3) {
          var sum = nums[i] + nums[j] + nums[k];
          if (sum > 0) {
            k--;
          }
          if (sum < 0) {
            j++;
          }
          if (sum == 0) {
            result.add(List.of(nums[i], nums[j], nums[k]));
            j++;
          }
          if (j == k) {
            ++i;
            j = i + 1;
            k = nums.length -1;
          }
          
        }
        return List.copyOf(result);
    }

}
