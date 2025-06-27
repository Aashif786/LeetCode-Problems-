// Last updated: 6/27/2025, 11:45:00 AM
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(0);
        ListNode temp = head;
        int carry = 0;
        while(l1 != null || l2 != null){
            int x = (l1 != null)? l1.val : 0;
            int y = (l2 != null)? l2.val : 0;
            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
            int sum = x + y + carry;
            carry = sum / 10;
            temp.next = new ListNode(sum % 10);
            temp = temp.next;
        }
        if (carry > 0){
            temp.next = new ListNode(carry);
        }
        return head.next;
    }
}