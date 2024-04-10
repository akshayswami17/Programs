package DSA;
//NumberOfTimesAGivenIntOccursInALinkedList





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


public class NumberOfTimesAGivenIntOccursInALinkedList
{

    static Node head = null;
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

    public static int numberOfTimesAGivenIntOccursInALinkedList(int no)
    {
        int count = 0 ;
        Node move = head;
        if(head.data==no){ count++;}
       while(move.next!= null)
       {
        move=move.next;
        if(move.data == no )
        {
            count++;
        }
        
       }
        

        
        return count;
        
    }
    public static void main(String[] args) 
    {
        NumberOfTimesAGivenIntOccursInALinkedList list = new NumberOfTimesAGivenIntOccursInALinkedList();

        // Insert nodes into the linked list
        list.insertNode(7);
        list.insertNode(8);
        list.insertNode(3);
        list.insertNode(31);
        list.insertNode(1);

        System.out.println("Original Linked List:");
        list.printList();

       
        int noToCheckCount = 1;
        System.out.println(list.numberOfTimesAGivenIntOccursInALinkedList(noToCheckCount));
        

       
        
    }
}

