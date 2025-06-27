// Last updated: 6/27/2025, 11:43:37 AM
class Solution {
    public ListNode removeElements(ListNode head, int val) {
        if(head == null) return head;
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode temp = dummy;
        while(temp.next != null){
            if(temp.next.val == val) temp.next = temp.next.next;
            else temp = temp.next;
        }
        return dummy.next;
    }
}