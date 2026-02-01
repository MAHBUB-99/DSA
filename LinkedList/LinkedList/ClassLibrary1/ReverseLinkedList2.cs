namespace ReverseLinkedList2
{
    public class ListNode
    {
        public int val;
        public ListNode next;
        public ListNode(int val = 0, ListNode next = null)
        {
            this.val = val;
            this.next = next;
        }
    }

    public class ReverseLinkedList2
    {
        public ListNode ReverseBetween(ListNode head, int left, int right)
        {
            ListNode curr = head;
            ListNode prev = head;
            int count = 1;
            while (count < left)
            {
                prev = curr;
                curr = curr.next;
                count++;
            }
            ListNode start = curr;
            Console.WriteLine(start.val);
            while (count < right)
            {
                start = start.next;
                count++;
            }
            ListNode nextt = start.next;
            if (nextt != null) Console.WriteLine(nextt.val);

            start.next = null;
            ListNode neww = Reverse(prev.next);
            if (neww != null) Console.WriteLine(neww.val);

            prev.next = neww;
            start.next = nextt;
            return head;
        }

        private ListNode Reverse(ListNode head)
        {
            ListNode curr = head;
            ListNode prev = null;
            while (curr != null)
            {
                ListNode temp = curr.next;
                curr.next = prev;
                prev = curr;
                curr = temp;
            }
            return prev;
        }
    }
    class Program
    {
        static void Main(string[] args)
        {
            // Build linked list: 1 -> 2 -> 3 -> 4 -> 5
            ListNode head = new ListNode(1,
                new ListNode(2,
                new ListNode(3,
                new ListNode(4,
                new ListNode(5)))));

            ReverseLinkedList2 solver = new ReverseLinkedList2();
            head = solver.ReverseBetween(head, 2, 4);

            // Print result
            PrintList(head);
        }

        static void PrintList(ListNode head)
        {
            while (head != null)
            {
                Console.Write(head.val + " ");
                head = head.next;
            }
        }
    }
}
