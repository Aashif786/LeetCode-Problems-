// Last updated: 6/27/2025, 11:42:03 AM

class Solution {
    public int getDecimalValue(ListNode head) {

        if(head == null) return 0;
        StringBuilder s = new StringBuilder();
        while(head != null){
            s.append(head.val);  
            head = head.next; 
        }
        return Integer.parseInt(s.toString(),2);
    }
}