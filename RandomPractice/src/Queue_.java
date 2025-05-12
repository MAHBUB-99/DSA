import java.util.LinkedList;
import java.util.Queue;

public class Queue_ {

    public static void main(String[] args) {
        // Create a queue of integers
        Queue<Integer>queue = new LinkedList<>();

        for(int i=1;i<=6;i++)
        {
            queue.add(i);////**********
        }

        System.out.println("All elements in queue: "+ queue);


        System.out.println(queue.poll());///****
        System.out.println(queue.peek());
        System.out.println(queue.size());
        for(int i : queue)
        {
            System.out.print(i+ " ");
        }
        System.out.println();
        System.out.println(queue.contains(5));
        queue.clear();
        System.out.println(queue);

        System.out.println(queue.poll());
    }
}
