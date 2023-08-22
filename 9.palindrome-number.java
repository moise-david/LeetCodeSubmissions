/*
 * @lc app=leetcode id=9 lang=java
 *
 * [9] Palindrome Number
 */

// @lc code=start
class Solution {
    public boolean isPalindrome(int x) {
        String numString = Integer.toString(x);
        int l = 0;
        int r = numString.length()-1;

        while (l < r) {
            if (numString.charAt(l) != numString.charAt(r)) return false;
            else {
                l++;
                r--;
            }
        }

        return true;
    }
}
// @lc code=end

