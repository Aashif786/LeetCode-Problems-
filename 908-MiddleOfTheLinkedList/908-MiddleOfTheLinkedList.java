// Last updated: 6/27/2025, 11:42:28 AM
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
    public ListNode middleNode(ListNode head) {
        int c = 0;
        ListNode temp = head;
        while(temp != null){
            temp = temp.next;
            c++;
        }
        temp = head;
        for(int i = 0 ; i<c/2 ; i++){
            temp = temp.next;
        }
        return temp;
    }
}