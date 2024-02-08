class linkedlist
{
    Node head, tail;
    int size =0;
    class Node{
        int data;
        Node next = null;

        public Node(int d)
        {
            data= d;
            next = null;
        }
    }

    public void add(int data)
    {
        Node n = new Node(data);
        if(head==null)
        {
            head=tail=n;
            size=1;
        }
        else
        {
            tail.next= n;
            tail=n;
            size++;
        }
    }
    public void display()
    {
        if(head==null)
        {
            System.out.println("no data");
        }
        else
        {
            Node temp = head;
            while(temp!=null)
            {
                System.out.println(temp.data);
                temp = temp.next;
            }
        }
    }
   
   public void addposition(int pos ,int data)
   {
        Node n = new Node(data);
        if(pos<1 && pos>size+1)
        {
            System.out.println("invalid pos");
        }
        else if (pos == 1)
        {
             n.next = head;
             head= n;
             size++;
        }
        else
        {
            Node temp = head;
            while(--pos>1)
            {
                temp = temp.next;
            }
            n.next = temp.next;
            temp.next = n;
            size++;
        }
   }
    public void addfirst(int data)
    {
        Node n = new Node(data);
        n.next = head;
        head= n;
        size++;
    }
    public void removefirst()
    {
        Node temp = head;
        head = temp.next;

    }
    public void removelast()
    {
        Node temp = head;
        if(head.next==null)
        {
            head=null;
        }
        else
        {
                while(temp.next.next != null)
            {
                temp = temp.next;
            }
            temp.next = null;
        }     

    }
    public static void main(String args[])
    {
        linkedlist l=  new linkedlist();
        System.out.println("...............................");
        l.add(10);
        l.add(20);
        l.add(30);
        l.display();
        System.out.println("...............................");

       // l.removelast();
        l.display();
        l.addfirst(5);
        System.out.println("...............................");

        l.display();
        l.addposition(3,28);
        System.out.println("...............................");

        l.display();
        l.removefirst();
        System.out.println("...............................");

        l.display();
        l.removelast();
        System.out.println("...............................");

        l.display();

    }
}