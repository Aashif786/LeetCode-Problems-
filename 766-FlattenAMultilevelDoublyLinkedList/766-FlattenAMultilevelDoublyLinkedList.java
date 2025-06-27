// Last updated: 6/27/2025, 11:42:42 AM
/*
// Definition for a Node.
class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;
};
*/

class Solution {
    public Node flatten(Node head) {
        for(Node temp = head; temp!=null ; temp = temp.next)
        {    
                if(temp.child!=null)
                {
                    Node nex = temp.next;
                    temp.next = temp.child;
                    temp.next.prev = temp;
                    temp.child = null;
                    Node tail = temp.next;
                    while(tail.next!=null){
                        tail = tail.next;
                    }
                    tail.next = nex;
                    if(nex!=null) nex.prev = tail;
                }
        }      
        return head;
    }
}