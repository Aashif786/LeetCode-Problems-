// Last updated: 6/27/2025, 11:44:49 AM
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp = head;
        int c =0;
        if (head == null) return null ;
        else
        {
            while(temp!=null){
                c++;
                temp = temp.next;
            }
            if (n > c) return head;  
            if (c == n) return head.next;

            ListNode x = new ListNode(0);
            x.next = head;
            ListNode prev = x;
            for(int i = 0 ; i<c-n ; i++){
                prev = prev.next;
            }
            prev.next = prev.next.next;
            return x.next;
        }
    }
}