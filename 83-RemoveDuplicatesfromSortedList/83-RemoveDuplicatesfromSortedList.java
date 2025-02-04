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
    public ListNode deleteDuplicates(ListNode head) {
        // if(head==null) return null;
        // if(head.next==null) return head;
        if(head==null || head.next==null) return head;
        ListNode temp=new ListNode(0);
        ListNode out =temp;
        while(head.next!=null){
            if(head.val==head.next.val){
                head=head.next;
            }
            else{
                temp.next=head;
                temp=temp.next;
                head=head.next;
            }
            temp.next=head;
        }
        return out.next;
    }
}