package DSA;



public class RemoveNthNodeFromEndOfTheLinkedList 
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
        int length = 0;
        Node move = head ;
        while(move!=null)
        {
            length++;
            move = move.next;
        }

        if(B > length)
        {
            System.out.print("Length of the linked list is " + length);
            System.out.print(" we can't remove "+ B + 
                             "th node from the");
            System.out.print(" linked list\n");
            return head;
        }
        else if(B == length){ return head.next;}
        else
        {
            int diff = length - B;
            Node prev = null;
            Node current = head;
            for(int i = 0 ;i<B;i++)
            {
                prev=current;
                current=current.next;

            }
            prev.next=current.next;
            return head;


        }

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
     
    int n = 1;
    
     
    System.out.print("Linked list before modification: \n");
    display(head);
 
    head = removeNthNodeFromEnd(head, n);
    System.out.print("Linked list after modification: \n");
    display(head);
}
}
