// Last updated: 6/27/2025, 11:44:18 AM
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
    public ListNode deleteDuplicates(ListNode h) {
        if(h==null || h.next==null) return h;
        ListNode temp = new ListNode(0);
        ListNode res = temp; 
        ListNode head = h;
        while(head.next!=null){
            if(head.val == head.next.val){
                head = head.next;
            }
            else{
                temp.next = head;
                temp = temp.next;
                head = head.next;
            }
            temp.next = head;
        }
        return res.next;
    }
}