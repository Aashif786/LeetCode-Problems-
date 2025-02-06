
class Solution {
    public ListNode insertionSortList(ListNode head) {
        if(head==null || head.next== null) return head;
        ListNode curr = head;
        ListNode x = new ListNode(0);
        while(curr != null){
            ListNode prev = x;
            while(prev.next != null && prev.next.val < curr.val) prev = prev.next;
            ListNode nn = curr.next;
            curr.next = prev.next;
            prev.next = curr;
            curr = nn;
        }
        return x.next;
    }
}