/*
 * @lc app=leetcode id=1 lang=java
 *
 * [1] Two Sum
 */

// @lc code=start

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            int pos = findAnswer(nums, i+1, target - nums[i]);
            if (pos != -1) return new int[]{i,pos};
        }

        return new int[]{};
    }

    public int findAnswer(int[] nums, int startPos, int calcSearch) {
        for (int i = startPos; i < nums.length; i++) {
            if (nums[i] == calcSearch) return i;
        }
        return -1;
    }
}
// @lc code=end

