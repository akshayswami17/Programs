
//Implementation of Floyd’s Cycle-Finding Algorithm.
public class DetectLoopInALinkedListUsing 
{
    static Node head = null;
    class Node
    {
        int data;
        Node next;
        Node(int x)
        {
            data=x;
            next=null;
        }
    }

    private void checkLoop()
    {
        Node slow_pointer = head ; 
        Node fast_pointer = head ;
        boolean flag = false ; 
        while(slow_pointer!=null && fast_pointer!=null && fast_pointer.next!=null)
        {
            slow_pointer = slow_pointer.next;
            fast_pointer = fast_pointer.next.next;
            if(slow_pointer == fast_pointer)
            {
                flag = true ;
                break;
            }

        }

        if(flag){System.out.println("Cycle is found in the linked list . ");}
        else{System.out.println("No Cycle is found in the linked list .");}
    }
    public void push(int newData)
    {
        Node newNode = new Node(newData);
        newNode.next = head;
        head = newNode;
    }
    public static void main(String[] args) 
    {
        DetectLoopInALinkedListUsing list = new DetectLoopInALinkedListUsing();
        list.push(10);
        list.push(20);
        list.push(30);
        list.push(40);
        list.head.next.next.next.next = list.head;
        

        list.checkLoop();
    }
    
}
