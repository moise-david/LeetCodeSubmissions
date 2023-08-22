/*
 * @lc app=leetcode id=21 lang=java
 *
 * [21] Merge Two Sorted Lists
 */

// @lc code=start
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list2 == null) return list1;
        else if (list1 == null) return list2;
        else {
            if (list1.val <= list2.val) return new ListNode(list1.val, mergeTwoLists(list1.next, list2));
            else return new ListNode(list2.val, mergeTwoLists(list2.next, list1));
        }
    }
}
// @lc code=end

