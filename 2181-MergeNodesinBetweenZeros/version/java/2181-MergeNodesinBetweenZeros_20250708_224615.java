// Last updated: 7/8/2025, 10:46:15 PM
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
    public ListNode mergeNodes(ListNode head) {
        if(head == null || head.next == null) return null;
        ListNode temp = head.next;
        int sum = 0;
        ListNode res = new ListNode(0);
        ListNode x = res;
        while (temp != null){
            if(temp.val == 0) {
                x.next = new ListNode(sum);
                sum = 0; 
                x = x.next;
            }
            sum += temp.val;
            temp = temp.next;
        }
        return res.next;
    }
}