// Last updated: 6/27/2025, 11:43:57 AM

public class Solution {
    public boolean hasCycle(ListNode head) {
        Set <ListNode> s = new HashSet<>();
        while(head!=null){
            if(s.contains(head)) return true;
            s.add(head);
            head = head.next;
        }
        return false;
    }
}