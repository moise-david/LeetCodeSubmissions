/*
 * @lc app=leetcode id=14 lang=java
 *
 * [14] Longest Common Prefix
 */

// @lc code=start
class Solution {
    public String longestCommonPrefix(String[] strs) {
        String baseString = strs[0];
        int pos = 0;

        if (baseString.length() > 0) {
            while (pos < baseString.length()) {
                char c = baseString.charAt(pos);
                if (checks(strs, c, pos)) pos ++;
                else break;
            }
        }

        return baseString.substring(0, pos);
    }

    public boolean checks(String[] strs, char c, int pos) {
        for (int i = 0; i < strs.length; i++) {
            if (pos >= strs[i].length() || strs[i].charAt(pos) != c) return false;
        }
        return true;
    }
}
// @lc code=end

