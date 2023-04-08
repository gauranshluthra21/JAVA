public class SinglyLinkedList {    
    //Represent a node of the singly linked list    
    
    class Node{    
        int data;    
        Node next;    
            
        public Node(int data) {    
            this.data = data;    
            this.next = null;    
        }    
    }    
     
    //Represent the head and tail of the singly linked list    
    public Node head = null;    
    public Node tail = null;    



        
    //addNode() will add a new node to the list    
    public void addNode(int data) {    
        //Create a new node    
        Node newNode = new Node(data);    
            
        //Checks if the list is empty    
        if(head == null) {    
            //If list is empty, both head and tail will point to new node    
            head = newNode;    
            tail = newNode;    
        }    
        else {    
            //newNode will be added after tail such that tail's next will point to newNode    
            tail.next = newNode;    
            //newNode will become new tail of the list    
            tail = newNode;    
        }    
    }    
        








    //  to add node in front



    /* This function is in LinkedList class. Inserts a
new Node at front of the list. This method is
defined inside LinkedList class shown above */
public void push(int new_data)
{
	/* 1 & 2: Allocate the Node &
			Put in the data*/
	Node new_node = new Node(new_data);

	/* 3. Make next of new Node as head */
	new_node.next = head;

	/* 4. Move the head to point to new Node */
	head = new_node;
}





//  add node after a given node


/* This function is in LinkedList class.
Inserts a new node after the given prev_node. This method is
defined inside LinkedList class shown above */
public void insertAfter(Node prev_node, int new_data)
{
	/* 1. Check if the given Node is null */
	if (prev_node == null) {
		System.out.println(
			"The given previous node cannot be null");
		return;
	}

	/* 2. Allocate the Node &
	3. Put in the data*/
	Node new_node = new Node(new_data);

	/* 4. Make next of new Node as next of prev_node */
	new_node.next = prev_node.next;

	/* 5. make next of prev_node as new_node */
	prev_node.next = new_node;
}








// add note at end of linked list


/* Appends a new node at the end. This method is
defined inside LinkedList class shown above */
public void append(int new_data)
{
	/* 1. Allocate the Node &
	2. Put in the data
	3. Set next as null */
	Node new_node = new Node(new_data);

	/* 4. If the Linked List is empty, then make the
		new node as head */
	if (head == null)
	{
		head = new Node(new_data);
		return;
	}

	/* 4. This new node is going to be the last node, so
		make next of it as null */
	new_node.next = null;

	/* 5. Else traverse till the last node */
	Node last = head;
	while (last.next != null)
		last = last.next;

	/* 6. Change the next of last node */
	last.next = new_node;
	return;
}








// To sort list via bubble sort




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







    // to delete nodes


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


//  to remove duplicate nodes


public void removeDuplicate(){
    Node current=head, temp=null,index=null;
    if(head==null){
        return;
    }
    else{
        while(current!=null){
            temp=current;
            index=current.next;
            while(index!=null){
                if(current.data==index.data){
                    temp.next=index.next;
                }
                else{
                    temp=index;
                }
                index=index.next;
            }
            current=current.next;
        
        }
    }
}




Node reverse(Node node)
{
    Node prev = null;
    Node current = node;
    Node next = null;
    while (current != null) {
        next = current.next;
        current.next = prev;
        prev = current;
        current = next;
    }
    node = prev;
    return node;
}

    //display() will display all the nodes present in the list    
    public void display() {    
        //Node current will point to head    
        Node current = head;    
            
        if(head == null) {    
            System.out.println("List is empty");    
            return;    
        }    
        System.out.println("Nodes of singly linked list: ");    
        while(current != null) {    
            //Prints each node by incrementing pointer    
            System.out.print(current.data + " ");    
            current = current.next;    
        }    
        System.out.println();    
    }    












        
    public static void main(String[] args) {    
            
        SinglyLinkedList sList1 = new SinglyLinkedList();    
        SinglyLinkedList sList2 = new SinglyLinkedList();
        SinglyLinkedList merge = new SinglyLinkedList();    

            
        //Add nodes to the list    
        sList1.addNode(1);    
        sList1.addNode(3);    
        sList1.addNode(5);    
        sList1.addNode(7);    
        sList1.addNode(9);  
       


            
        //Displays the nodes present in the list    
        sList1.display();    



        sList2.addNode(2);    
        sList2.addNode(4);    
        sList2.addNode(6);    
        sList2.addNode(8); 
        
        sList2.display();









  
        // sList.sortList();

        // sList.display();

        // sList.removeDuplicate();
        // sList.display();

        // sList.middleNode();    
        // sList.display();


   


   }    
}    