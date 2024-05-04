




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


public class ToGetNthNodeInALinkedList
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

    public int GetNthElement(int index)
    {
        Node move = head;
        int count = 0 ;
        while(move != null)
        {
            if(count == index)
            {
                return move.data;
            }
            count++;
            move = move.next;
        }

        return index;
    }
    public static void main(String[] args) 
    {
        ToGetNthNodeInALinkedList list = new ToGetNthNodeInALinkedList();

        // Insert nodes into the linked list
        list.insertNode(1);
        list.insertNode(2);
        list.insertNode(3);
        list.insertNode(4);
        list.insertNode(5);

        System.out.println("Original Linked List:");
        list.printList();

       
        int position = 2;
        System.out.println(list.GetNthElement(position));
        

       
        
    }
}
