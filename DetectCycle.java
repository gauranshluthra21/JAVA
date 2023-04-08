public class DetectCycle {

    class Node{
        int data;    
        Node next;    
            
        public Node(int data) {    
            this.data = data;    
            this.next = null;    
        } 

    }

    public boolean hasCycle(Node head) {
        if(head==null){
            return false;
        }
        
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                return true;
            }
           
        }
        return false;
    }
    
}
