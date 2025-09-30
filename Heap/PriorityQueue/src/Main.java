import java.util.*;

public class Main {

    // ✅ Create a min-heap (smallest element first)
    PriorityQueue<Integer> minHeap = new PriorityQueue<>();

    // ✅ Create a max-heap (largest element first)
    PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

    // 👉 Add element to minHeap
    public void addToMinHeap(int val) {
        minHeap.offer(val);
    }

    // 👉 Add element to maxHeap
    public void addToMaxHeap(int val) {
        maxHeap.offer(val);
    }

    // 👉 Get the smallest element from minHeap (without removing)
    public int getMin() {
        if(minHeap.isEmpty())
            return -1;
        return minHeap.peek();
    }

    // 👉 Get the largest element from maxHeap (without removing)
    public int getMax() {
        if(maxHeap.isEmpty())
            return -1;
        return maxHeap.peek(); // placeholder
    }

    // 👉 Remove and return smallest element from minHeap
    public int pollMin() {
        if(minHeap.isEmpty())
            return -1;
        return minHeap.poll(); // placeholder
    }

    // 👉 Remove and return largest element from maxHeap
    public int pollMax() {
        if(maxHeap.isEmpty())
            return -1;
        return maxHeap.poll(); // placeholder
    }

    // 👉 Check if minHeap is empty
    public boolean isMinHeapEmpty() {
        return minHeap.isEmpty();
    }

    // 👉 Check size of maxHeap
    public int maxHeapSize() {
        return maxHeap.size();
    }

    // 👉 Print all elements of minHeap
    public void printMinHeap() {
        System.out.println(minHeap);
    }

    // 👉 Print all elements of maxHeap
    public void printMaxHeap() {
        System.out.println(maxHeap);
    }

    // 👉 Main driver
    public static void main(String[] args) {
        Main pqDemo = new Main();

        // Test minHeap
        pqDemo.addToMinHeap(10);
        pqDemo.addToMinHeap(5);
        pqDemo.addToMinHeap(20);

        System.out.println("MinHeap peek: " + pqDemo.getMin());   // should be 5
        System.out.println("MinHeap poll: " + pqDemo.pollMin()); // should remove 5
        pqDemo.printMinHeap();

        // Test maxHeap
        pqDemo.addToMaxHeap(10);
        pqDemo.addToMaxHeap(5);
        pqDemo.addToMaxHeap(20);

        System.out.println("MaxHeap peek: " + pqDemo.getMax());   // should be 20
        System.out.println("MaxHeap poll: " + pqDemo.pollMax()); // should remove 20
        pqDemo.printMaxHeap();

        System.out.println("Is minHeap empty? " + pqDemo.isMinHeapEmpty());
        System.out.println("MaxHeap size: " + pqDemo.maxHeapSize());
    }
}