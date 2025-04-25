import java.util.LinkedList;

public class LinkedList_ {
    static class Node{
        int value;
        Node next;
        Node(int val)
        {
            value=val;
            next=null;
        }
    }
    Node head;

    public static void findMid(LinkedList_ list)
    {
        Node ptr1 = list.head;
        Node ptr2 = list.head;

        while(ptr1.next!=null)
        {
            ptr1 = ptr1.next;
            if(ptr1.next!=null)
            {
                ptr1=ptr1.next;
                ptr2=ptr2.next;
            }
        }
        System.out.println("Mid Value: "+ptr2.value);

    }


    static void printList(Node node)
    {
        System.out.print("head");
        while(node!=null)
        {
            System.out.print("->"+node.value);
            node=node.next;
        }
        System.out.println();
    }

    static void reverseList(Node node)
    {
        Node current = node;
        Node previous = null;
        Node next;



    }
    public static void main(String[] args) {
        LinkedList_ list = new LinkedList_();

        Node one = new Node(1);
        Node two = new Node(2);
        Node three = new Node(3);
        Node four = new Node(4);
        Node five = new Node(5);

        list.head = one;
        one.next=two;
        two.next=three;
        three.next=four;
        four.next=five;
        //printing
        printList(list.head);
        //finding middle value
        findMid(list);
        //reverse linkedlist
        reverseList(list.head);


    }
}