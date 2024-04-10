package DSA;
//CheckIfALinkedListIsCircularLinkedList2

import java.util.LinkedList;

class Node{
    int data;
    Node next;
    public Node(int data)
    {
        this.data = data;
        this.next = next;
    }
}
public class CheckIfALinkedListIsCircularLinkedList2 
{
    Node head = null;
    public void addToFront(int data)
    {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }
    public boolean checkIfALinkedListIsCircularLinkedList2()
    {
        if(head == null){ return false;}
        Node slow = head;
        Node fast = head;
        while(fast!= null && fast.next!=null)
        {
            if(slow == fast){ return true; }
            slow = slow.next;
            fast = fast.next.next;
        }
        return false;
    }

    public static void main(String[] args) 
    {
        CheckIfALinkedListIsCircularLinkedList2 l = new CheckIfALinkedListIsCircularLinkedList2();
        l.addToFront(1);
        l.addToFront(2);
        l.addToFront(3);
        l.addToFront(4);
        l.addToFront(5);
        System.out.println(l.checkIfALinkedListIsCircularLinkedList2()?"Yes .":"No .");

        
    }

    
}
