// Last updated: 6/27/2025, 11:43:48 AM
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) return null;
        ListNode a = headA , b = headB;
        while(a != b){ 
            a = (a == null) ? a = headA : a.next;
            b = (b == null) ? b = headB : b.next;
        }
        return a;
    }
}