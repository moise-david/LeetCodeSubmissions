/*
 * @lc app=leetcode id=10 lang=java
 *
 * [10] Regular Expression Matching
 */

// @lc code=start
class Solution {
    public boolean isMatch(String s, String p) {
        while (p.length() > 1) {
            char c = p.charAt(0);
            p = p.substring(1);
            if (c == '.' || c == s.charAt(0)) s.substring(1);
        }
        return p == "*" || (p == "." && s.length() == 1) || p == s;
    }
}
// @lc code=end

