// Last updated: 8/6/2025, 12:57:25 PM
class Solution {
    public ListNode swapPairs(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode res = head.next; 
        ListNode prev = null; 
        ListNode curr = head; 
        while(curr != null && curr.next != null){
            ListNode t = curr.next.next;
            if(prev != null) prev.next = curr.next;
            curr.next.next = curr;
            curr.next = t;
            prev = curr;
            curr = curr.next;
        }     
        return res;
    }
}

// class Solution {
//     public ListNode swapPairs(ListNode head) {
//         if(head == null || head.next == null) return head;
//         ListNode res = head.next; 
//         ListNode prev = head; 
//         ListNode curr = head.next; 
//         // ListNode prev = null; 
//         // ListNode curr = head; 
//         // int i = 1;

//         while(curr != null){
//             // if(i % 2 == 1){
//                 // prev.next = curr.next;
//                 // curr.next = prev;
//                 // curr = prev.next;
//                 // ListNode t = prev;
//                 // prev = curr;
//                 // curr = t;
//                 ListNode t = curr.next;
//                 prev.next = t;
//                 t.next = curr;
//                 curr.next = t.next;
//                 prev = curr;
//                 curr = prev.next;
//             // }
//             // prev = prev.next;
//             // curr = curr.next;
//             // i++;
//         }
//         return res;
//     }
// }