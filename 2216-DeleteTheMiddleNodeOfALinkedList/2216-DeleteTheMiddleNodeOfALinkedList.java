// Last updated: 6/27/2025, 11:41:19 AM
class Solution {
    public ListNode deleteMiddle(ListNode head) {
        if(head == null) return head;
        if(head.next == null) {head = null; return head;}
        int n = 0;
        ListNode temp = head;
        while(temp != null) {temp = temp.next; n++;}
        mid(head, n/2);
        return head;
    }

    static void mid(ListNode head, int n){
        ListNode temp = head;
        int i = 1;
        while(i < n){ temp = temp.next; i++;}
        temp.next = temp.next.next;
    }
}