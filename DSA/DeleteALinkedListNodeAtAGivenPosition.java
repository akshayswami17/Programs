package DSA;



 class Node 
{
    int data;
        Node next;
        Node(int x)
        {
            data=x;
            next=null;
        }
        public String toString() {
            return data+" ";
        }
    
}


public class DeleteALinkedListNodeAtAGivenPosition
{

    Node head = null;
    public void insertNode(int val)
    { 
        Node newNode = new Node(val);
        if(head == null )
        {
            head = newNode;
            return;
        }
        Node move = head ;
         while(move.next != null)
         {
            move = move.next;
         }
         move.next = newNode;
    }

    public void printList() {
        Node move = head;
        while (move != null) {
            System.out.print(move.data + " -> ");
            move = move.next;
        }
        System.out.println("null");
    }

    public void deleteNode(int position)
    {
        if(head == null)
        {
            return;
        }
        Node move = head;
        if(position == 0)
        {
            head = head.next;
            return;
        }
        for(int i = 0 ; move!=null && i<position-1 ; i++)
        {
            move = move.next;
        }
        if(move==null && move.next==null)
        {
            return;
        }
        move.next=move.next.next;

    }
    public static void main(String[] args) 
    {
        DeleteALinkedListNodeAtAGivenPosition list = new DeleteALinkedListNodeAtAGivenPosition();

        // Insert nodes into the linked list
        list.insertNode(1);
        list.insertNode(2);
        list.insertNode(3);
        list.insertNode(4);
        list.insertNode(5);

        System.out.println("Original Linked List:");
        list.printList();

        // Delete node at position 2 (value 3)
        int positionToDelete = 2;
        list.deleteNode(positionToDelete);

        System.out.println("Linked List after deletion at position " + positionToDelete + ":");
        list.printList();
        
    }
}