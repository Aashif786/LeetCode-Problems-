// Last updated: 6/27/2025, 11:40:54 AM
class Solution {

    static int gcdval(int a, int b){ return b == 0 ? a : gcdval(b, a % b); }

    public ListNode insertGreatestCommonDivisors(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode temp = head;
        while(temp != null && temp.next != null){
            int x = gcdval(temp.val, temp.next.val);
            ListNode gcd = new ListNode(x);
            gcd.next  = temp.next;
            temp.next = gcd;
            temp = gcd.next;
        }        
        return head;
    }
}