public class practice8{

    class Node{
        int data;
        Node next;

        public Node(int data){
            this.data=data;
            this.next=null;
        }

    }

    public Node head=null;
    public Node tail=null;


    public void addNode(int data){
        Node newNode = new Node(data);
        if(head==null){
            head=newNode;
            tail=newNode;
        }
        else{
            tail.next=newNode;
            tail=newNode;
        }
    }





    public void sortList()
    {
 
        // Node current will point to head
        Node current = head, index = null;
 
        int temp;
 
        if (head == null) {
            return;
        }
        else {
            while (current != null) {
                // Node index will point to node next to
                // current
                index = current.next;
 
                while (index != null) {
                    // If current node's data is greater
                    // than index's node data, swap the data
                    // between them
                    if (current.data > index.data) {
                        temp = current.data;
                        current.data = index.data;
                        index.data = temp;
                    }
 
                    index = index.next;
                }
                current = current.next;
            }
        }
    }


    public void removeDuplicate(){
        Node current=head,index=null,temp=null;
        if(head==null){
            return;
        }
        else{
            while(current!=null){
                index=current.next;
                temp=current;
                while(index!=null){
                    if(current.data==index.data){

                        temp.next=index.next;
                    }
                    index=index.next;
                }
                current=current.next;
            }
        }
    }


    public void toDelete(int pos){
        if(head==null){
            return;
        }
        Node temp=head;
        if(pos==0){
            head=temp.next;
            return;
        }

        for(int i=0;temp!=null && i<pos-1;i++)
        temp=temp.next;
        if(temp==null || temp.next==null )
        return;

        Node next=temp.next.next;
        temp.next=next;

        }

    

    public void display(){
        Node current=head;
        if(head==null){
            System.out.println("list is empty");
            return;
        }
        System.out.println("nodes of linked list");
        while(current!=null){
            System.out.print(current.data+" ");
            current=current.next;
        }
        System.out.println();
    }


    public static void main(String[] args) {
        practice8 sList=new practice8();

        sList.addNode(1);    
        sList.addNode(4);    
        sList.addNode(2);    
        sList.addNode(3);    
        sList.addNode(3);  
        sList.addNode(5);
        sList.addNode(3);  
        sList.addNode(6); 


        sList.display();

       


        sList.sortList();

        sList.display();

        sList.removeDuplicate();
        sList.display();

        sList.toDelete(2);
        sList.display();



        
    }

}