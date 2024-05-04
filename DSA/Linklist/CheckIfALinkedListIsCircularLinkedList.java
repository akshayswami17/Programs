







 class Node 
{
    int data;
        Node next;
        Node(int x)
        {
            data=x;
            next=null;
        }
        public Node() {
            //TODO Auto-generated constructor stub
        }
        public String toString() {
            return data+" ";
        }
    
}


public class CheckIfALinkedListIsCircularLinkedList
{

    static Node head = null;
    public  static Node insertNode(int data)
    { 
        Node newNode = new Node();
        newNode.data = data;
        newNode.next = null;
        return newNode;
        
    }

    public void printList() {
        Node move = head;
        while (move != null) {
            System.out.print(move.data + " -> ");
            move = move.next;
        }
        System.out.println("null");
    }

    public static boolean  checkIfALinkedListIsCircularLinkedList(Node head)
    {
        if(head==null){ return true;}
        Node move = head;
        while(move.next != null && move.next != head){ move = move.next;}
        
        return (move == head);
    }
    public static void main(String[] args) 
    {
        Node head = insertNode(1);
        head.next = insertNode(2);
        head.next.next = insertNode(3);
        head.next.next.next = insertNode(4);
        head.next.next.next.next = insertNode(5);
        head.next.next.next.next.next = head;
        System.out.println(checkIfALinkedListIsCircularLinkedList(head)?"Yes":"No");

        
       
        
    }
}


