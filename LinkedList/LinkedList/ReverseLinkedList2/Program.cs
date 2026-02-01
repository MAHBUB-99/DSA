class Program
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
    public static ListNode ReverseBetween(ListNode head, int left, int right)
    {
        ListNode result = new ListNode(0);
        result.next = head;
        ListNode prev = result;
        int count = 1;
        while (count < left)
        {
            prev = prev.next;
            count++;
        }
        ListNode start = prev.next;
        ListNode curr = start;
        while (count < right)
        {
            curr = curr.next;
            count++;
        }
        ListNode nextt = curr.next;
        curr.next = null;

        ListNode neww = Reverse(prev.next);

        prev.next = neww;
        start.next = nextt;
        return result.next;
    }
    private static ListNode Reverse(ListNode head)
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
    static void Main()
    {
        ListNode head = new ListNode(1,
            new ListNode(2,
            new ListNode(3,
            new ListNode(4,
            new ListNode(5)))));

        ReverseBetween(head, 2, 4);

        while (head != null)
        {
            Console.Write(head.val + " ");
            head = head.next;
        }
    }
}
