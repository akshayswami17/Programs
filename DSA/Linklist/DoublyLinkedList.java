import java.util.Scanner;

class Node 
{
    int data;
    Node prev, next;

    public Node(int data)
    {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}

public class DoublyLinkedList 
{
    Node Head;
    
    public DoublyLinkedList()
    {
        this.Head = null;
    }

    public void createLinkedList()
    {
       
            // System.out.print("Enter data to list: ");
            // int data = sc.nextInt();
            addNode(10);
            addNode(20);
            addNode(30);
            addNode(40);
            addNode(50);
       
    }
    // public void createLinkedList(int size)
    // {
    //     Scanner sc = new Scanner(System.in);
    //     for (int i = 0; i < size; i++)
    //     {
            // System.out.print("Enter data to list: ");
            // int data = sc.nextInt();
    
    //     }
    // }

    public void addNode(int data)
    {
        Node newNode = new Node(data);
        if (Head == null)
        {
            Head = newNode;
        }
        else
        {
            Node move = Head;
            while (move.next != null)
            {
                move = move.next;
            }
            move.next = newNode;
            newNode.prev = move;
        }
    }

    public void display()
    {
        Node move = Head;
        while (move != null)
        {
            System.out.print(move.data + " ");
            move = move.next;
        }
        System.out.println();
    }

    public void addBeg(int data)
    {
        Node n1 = new Node(data);
        if(Head == null)
        {
            Head = n1;
        }
        else{
            n1.next = Head;
            Head.prev = n1;
            Head = n1 ;

        }
    }

    public void addEnd(int data)
    {
        Node n1 = new Node(data);
        Node move = Head;
        while(move.next!= null)
        {
            move = move.next;

        }
        move.next=n1;
        n1.prev=move;

    }

    public int size()
    {
        int count = 0 ;
        Node move = Head;
        while(move!=null)
        {
            move=move.next;
            count++;
        }
        return count;

    }

    public void insert(int pos , int data)
    {
        
        int count = size();
        if(pos <= 0 || pos >count+1)
        {
            System.out.println("INVALID POSITION");
        }
        else{
            Node n1 = new Node(data);
            if(pos == 1)
            {
                if(Head == null){ Head = n1; }
                else{ n1.next=Head; Head.prev=n1; Head=n1;}
            }
            else
            {
                Node move = Head;
                for(int i=1 ; i<pos-1 ; i++)
                {
                    move = move.next;
                    n1.next=move.next;
                    if(n1.next!=null)
                    {
                        move.next.prev=n1;

                    }
                    move.next=n1;
                    n1.prev=move;
                }

            }
        }
    }

// worng method. (deleteData)
    public void deleteData(int data)
    {
        if(Head.data == data)
        {
            if(Head.next == null)
            {
                Head = null;

            }
            else
            {
                Head.next.prev=null;
                Head = Head.next;
    
            }
        }
        else
        {
            Node move = Head;
            while(move!=null && move.data!=data)
            {
                move = move.next;
                if(move == null)
                {
                    System.out.println("Data not found");
                    return;
                }
                if(move.next!=null)
                {
                    move.next.prev=move.prev;
                    move.prev.next=move.next;
                }
                else
                {move.prev.next=null;

                }
            }

        }
    }

    public static void main(String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList();
        dll.createLinkedList();
        dll.display();
        dll.addBeg(100);
        dll.display();
        dll.addEnd(200);
        dll.display();
        System.out.println("Size : "+dll.size());
        dll.insert(3, 250);
        dll.display();
        dll.deleteData(50);
        dll.display();
    }
}
