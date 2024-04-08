package DSA;



public class RemoveNthNodeFromEndOfTheLinkedList2 
{
    static class Node
    {
        int data;
        Node next;
    }

    public static Node createNode(Node head , int x)
    {
        Node newNode ;
        Node move = head ;
        newNode = new Node();
        newNode.data =x ;
        newNode.next = null;
        if(head == null)
        {
            head = newNode;
        }
        else
        {
            while(move.next != null){move = move.next;}move.next = newNode;
        }
        return head;

    }

    public static Node removeNthNodeFromEnd(Node head , int B)
    {
        Node start = new Node();
        start.next=head;
        Node fastPtr = start;
        Node slowPtr = start;
        for(int i = 0 ; i< B ;i++)
        {
            fastPtr = fastPtr.next;
        }
        while(fastPtr.next != null)
        {
            fastPtr = fastPtr.next;
            slowPtr = slowPtr.next;

        }
        slowPtr.next=slowPtr.next.next;
        return start.next;


       
    }
    static void display(Node head)
{
    Node temp = head;
    while (temp != null) 
    {
        System.out.print(temp.data + " ");
        temp = temp.next;
    }
    System.out.println();
}
public static void main(String[] args)
{
    Node head = null;
     
    head = createNode(head, 1);
    head = createNode(head, 2);
    head = createNode(head, 3);
    head = createNode(head, 4);
    head = createNode(head, 5);
     
    int n = 2;
    
     
    System.out.print("Linked list before modification: \n");
    display(head);
 
    head = removeNthNodeFromEnd(head, n);
    System.out.print("Linked list after modification: \n");
    display(head);
}
}
