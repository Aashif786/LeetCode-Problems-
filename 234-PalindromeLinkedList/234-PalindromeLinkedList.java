// Last updated: 6/27/2025, 11:43:24 AM
class Solution {
    public boolean isPalindrome(ListNode head) {
        if(head == null) return true;
        ListNode temp = head;
        StringBuilder s = new StringBuilder();
        while(temp != null){
            s.append(temp.val);  
            temp = temp.next; 
        }
        return s.toString().equals(s.reverse().toString());
    }
}