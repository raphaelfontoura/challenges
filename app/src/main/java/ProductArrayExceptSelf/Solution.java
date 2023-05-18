package ProductArrayExceptSelf;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] productExceptSelf(int[] nums) {
        var result = new int[nums.length];
        var pre = 1;
        var post = 1;
        for(int i = 0; i < nums.length; i++) {
            result[i] = pre;
            pre *= nums[i];
        }
        for (int i = nums.length -1; i >= 0; i--) {
            result[i] *= post;
            post *= nums[i];
        }

        return result;
    }
}
