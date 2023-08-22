/*
 * @lc app=leetcode id=20 lang=java
 *
 * [20] Valid Parentheses
 */

// @lc code=start

import java.util.Stack;

class Solution {
public boolean isValid(String s) {
        Stack<Character> opens = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(' || c == '{' || c == '[') opens.add(c);
            else {
                if (opens.size() == 0) return false;
                else {
                    if (!openMatch(c, opens)) return false;
                }
            }
        }
        
        return opens.size() == 0;
    }

    public boolean openMatch(char c, Stack<Character> s) {
        if (c == ')') return s.pop() == '(';
        else if (c == '}') return s.pop() == '{';
        else return s.pop() == '[';
    }
}
// @lc code=end

