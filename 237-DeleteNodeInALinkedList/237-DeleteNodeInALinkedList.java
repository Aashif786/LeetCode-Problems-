// Last updated: 6/27/2025, 11:43:25 AM
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
        if (node == null || node.next == null) return;
        node.val = node.next.val;  
        node.next = node.next.next;
    }
}