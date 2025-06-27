// Last updated: 6/27/2025, 11:42:32 AM
class MyLinkedList {

    static class node{
        int data;
        node next;
        node(int d){
            data = d;
            next = null;
        }
    }

    private node head;
    private node tail;

    public MyLinkedList() {
        head = null;
        tail = null;
    }
    
    public int get(int index) {
        node temp = head;
        int i = 0;
        while(temp != null && i < index){
            temp = temp.next;i++;
        }
        return (temp != null) ? temp.data : -1;
    }
    
    public void addAtHead(int val) {
        node nn = new node(val);
        if(head == null) {head = nn; tail = nn;return;}
        nn.next = head;
        head = nn;
    }
    
    public void addAtTail(int val) {
        node nn = new node(val);
        if(head == null) {
            head = nn; 
            tail = nn;
            return;
        }
        tail.next = nn;
        tail = nn;
    }
    
    public void addAtIndex(int index, int val) {
        if (index < 0) return;
        if(index == 0) {
            addAtHead(val);
            return;
        }
        node nn = new node(val);
        node temp = head;
        int i = 0;
        while(temp != null && i < index-1){
            temp = temp.next;i++;
        }
        if(temp == null) return;
        nn.next = temp.next;
        temp.next = nn;
        if(nn.next == null) tail = nn;
    }
    
    public void deleteAtIndex(int index) {
        if (head == null) return; 
        if (index < 0) return;
        if(index == 0) {
            head = head.next;
            return;
        }
        node temp = head;
        int i = 0;
        while(temp != null && i < index-1){
            temp = temp.next;i++;
        }
        if(temp == null || temp.next == null) return;
        temp.next = temp.next.next;
        if(temp.next == null) tail = temp;
    }
}


