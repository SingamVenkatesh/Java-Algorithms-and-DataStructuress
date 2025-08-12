package RecursionLearning.LinkedList;

public class LL
{
    private Node head;
    private Node tail;
    private int size;
    public LL()

    {
        this.size=0;
    }

    public void insertFirst(int val)
    {
        Node node=new Node(val); // created new node and passed value
        node.next=head;
        head=node; // here assigning agian head to first node that means which we inserted node.
        if(tail==null)
        {
            tail=head;
        }
        size=size+1;
    }
    public void insertLast(int val)
    {
        Node node=new Node(val);
        if(tail==null)
        {
            head=tail=node;
            return;
        }
        tail.next=node;
        tail=node;
        size=size+1;
    }
    public void insert(int val,int index)
    {

        if(index==0)
        {
            insertFirst(val);
            return;
        }
        if(index==size)
        {
            insertLast(val);
            return;
        }
        Node temp=head;
        for (int i=1;i<index;i++)
        {
            temp=temp.next;
        }
        Node node=new Node(val,temp.next);
        temp.next=node;
        size=size+1;
    }
public int delete(int index)
{
    if(index==0)
    {
       return deleteFIrst();
    }
    if(index==size-1)
    {
       return deleteLast();
    }
    Node pre=get(index-1);
    int val=pre.next.value;
    pre.next=pre.next.next;
    size--;
    return val;
}
public Node find(int value)
{
    Node node=head;
    while (node !=null)
    {
        if(node.value==value)
        {
            return node;
        }
        node=node.next;
    }
    return node;
}
    public  int deleteFIrst()
    {
        int val=head.value;
        head=head.next;
        if(head==null)
        {
            tail=null;
        }
        size--;
        return val;
    }
    public int deleteLast()
    {
        if(size<=1)
        {
            return deleteFIrst();
        }
        Node secondlast=get(size-2);
        int val=tail.value;
        tail=secondlast;
        tail.next=null;
        return val;
    }
    public  Node get(int index)
    {
        Node node=head;
        for(int i=0;i<index;i++)
        {
            node=node.next;
        }
        return node;
    }
    public Node getMid(Node head) // this will return the another half list from the mid
    {
        if (head == null || head.next == null) {
            return head; // If only one node or empty list, return as is
        }
        Node midPrev = null;
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null)
        {
            if (midPrev == null) {
                midPrev = slow;
            } else
            {
                midPrev=midPrev.next;
            }
            //  midPrev = (midPrev == null) ? slow : midPrev.next;
            slow = slow.next;
            fast = fast.next.next;
        }
        Node mid = midPrev.next;
        midPrev.next = null; // Break the list

        return mid;
    }
    public void display()
    {
        Node temp=head;
        while (temp!=null)
        {
            System.out.print(temp.value + "-->");
            temp=temp.next;
        }
        System.out.println("END");
    }
    private class Node
    {
        private int value;
        private Node next;
        public Node(int value)
        {
          this.value=value;
        }
        public Node(int value,Node next)
        {
           this.value=value;
           this.next=next;
        }
    }


    // recusrion method to reverse a linked list

    private void reverse(Node node)
    {
        if(node==tail)
        {
            head=tail;
            return;

        }
        reverse(node.next);

        tail.next=node;
        tail=node;
        tail.next=null;
    }
    // iterative method to reverse a linked list
    public void IterativeRevsere(Node node)
    {
        if(size<2)
        {
            return;
        }
        Node prev=null;
        Node present=head;
        Node next=present.next;

        while (present!=null)
        {
            present.next=prev;
            prev=present;
            present=next;
            if(next!=null)
            {
                next=next.next;
            }
        }
        head=prev;
    }
    // Questions how to remove dupliacates
    public void RemoveDupliactes()
    {
        Node node=head;

        while (node.next!=null)
        {
            if(node.value==node.next.value) {
                node.next=node.next.next;
                size--;
            }
            else
            {
                node=node.next;
            }
        }
        tail=node;
        tail.next=null;
    }
    // how to merge 2 linked lists in another list where 2 lists are sorted
    public static LL Mergee(LL first ,LL second)
    {
        Node f= first.head;
        Node s=second.head;
        LL ans=new LL();
        if(f==null)
        {
            return second;
        }
        if(s==null)
        {
            return first;
        }
        while (f!=null && s!=null)
        {
            if(f.value< s.value)
            {
                ans.insertLast(f.value);
                f=f.next;
            }
            else {
                ans.insertLast(s.value);
                s=s.next;
            }
        }
        while (f!=null)
        {
            ans.insertLast(f.value);
            f=f.next;
        }
        while (s!=null)
        {
            ans.insertLast(s.value);
            s=s.next;

        }
        return ans;
    }
    public void displayforhalflistfrommiddle(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value+ " -> ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }
    public Node reverseForPalindrom(Node head) {
        if (head == null) {
            return head;
        }
        Node prev = null;
        Node present = head;
        Node fucture = present.next;
        while (present != null) {
            present.next = prev;
            prev = present;
            present = fucture;
            if (fucture != null) {
                fucture = fucture.next;
            }
        }
        return prev;
    }
public boolean isPalindrome(Node head)
{
    Node mid=getMid(head);
    Node headsecond=reverseForPalindrom(mid);
    Node reReverse=headsecond;


    while(head!=null&&headsecond!=null)
    {
        if(head.value!=headsecond.value)
        {
            break;
        }
        head=head.next;
        headsecond=headsecond.next;


    }
    reverseForPalindrom(reReverse);

    if(head==null || headsecond==null)
    {
        return true;
    }
    else
    {
        return false;
    }

}





    public static void main(String[] args) {
        /* // this is to remove duplacates in linked list
        LL list=new LL();
        list.insertFirst(1);
        list.insertFirst(1);
        list.insertFirst(2);
        list.insertFirst(2);
        list.insertFirst(3);
        list.insertFirst(3);
        list.display();
        list.RemoveDupliactes();
        list.display();*/

        // to check 2 linkedlist merge problem
        LL list1=new LL();
        list1.insertLast(1);
        list1.insertLast(3);
        list1.insertLast(5);
      //  list1.display();


        LL list2=new LL();
        list2.insertLast(1);
        list2.insertLast(2);
        list2.insertLast(9);
        list2.insertLast(14);
        list2.insertLast(1);
        list2.insertLast(2);
        list2.insertLast(9);
        list2.insertLast(14);
        //list2.display();
       // list2.getMid(list2.head);

         list2.display();
       Node midHead=list2.getMid(list2.head);
        list2.displayforhalflistfrommiddle(midHead);
      //  LL ans=Mergee(list1,list2);
      // ans.display();





    }
}
