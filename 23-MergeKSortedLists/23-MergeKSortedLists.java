// Last updated: 6/27/2025, 11:44:45 AM
 class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists == null || lists.length == 0) return null;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(ListNode list : lists){
            ListNode temp = list;
            while(temp!=null){
                pq.offer(temp.val) ;
                temp = temp.next;
            }
        }
        ListNode x  = new ListNode(0);
        ListNode temp = x;
        // ListNode temp = head;
        while(!pq.isEmpty()){
            temp.next =  new ListNode(pq.poll());
            temp = temp.next;
        }
        return x.next;
    }
}