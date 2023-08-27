package BinarySearch;

import java.util.Arrays;

public class Solution {
  
  public int search(int[] nums, int target) {
    Arrays.sort(nums);
    var result = -1;
    var low = 0;
    var high = nums.length - 1;
    while(low <= high) {
      var mid = (low + (high-low) / 2);
      if (nums[mid] < target) {
        low = mid + 1;
      } else if (nums[mid] > target) {
        high = mid - 1;
      } else if (nums[mid] == target) {
        result = mid;
        break;
      }
    }

    return result;
  }
}
