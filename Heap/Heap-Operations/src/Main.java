class MaxHeap {
    private int[] heap;
    private int size;
    private int capacity;

    // Constructor
    public MaxHeap(int capacity) {
        this.capacity = capacity;
        heap = new int[capacity];
        size = 0;
    }

    // Parent, left, right index
    private int parent(int i) { return (i - 1) / 2; }
    private int leftChild(int i) { return 2 * i + 1; }
    private int rightChild(int i) { return 2 * i + 2; }

    private void swap(int a, int b) {
        int temp = heap[a];
        heap[a] = heap[b];
        heap[b] = temp;
    }

    // Heapify Down (used in delete and heap sort)
    private void heapifyDown(int i) {
        int largest = i;
        int left = leftChild(i);
        int right = rightChild(i);

        if (left < size && heap[left] > heap[largest]) {
            largest = left;
        }
        if (right < size && heap[right] > heap[largest]) {
            largest = right;
        }

        if (largest != i) {
            swap(i, largest);
            heapifyDown(largest);
        }
    }

    // Heapify Up (used in insert)
    private void heapifyUp(int i) {
        while (i > 0 && heap[parent(i)] < heap[i]) {
            swap(parent(i), i);
            i = parent(i);
        }
    }

    // Insert element
    public void insert(int val) {
        if (size == capacity) {
            System.out.println("Heap is full!");
            return;
        }
        heap[size] = val;
        size++;
        heapifyUp(size - 1);
    }

    // Delete root (max element)
    public int deleteRoot() {
        if (size == 0) {
            System.out.println("Heap is empty!");
            return -1;
        }
        int deleted = heap[0];
        heap[0] = heap[size - 1];
        size--;
        heapifyDown(0);
        return deleted;
    }

    // Build Heap from array
    public void buildHeap(int[] arr) {
        heap = arr;
        size = arr.length;
        for (int i = size / 2 - 1; i >= 0; i--) {
            heapifyDown(i);
        }
    }

    // Utility: print heap
    public void printHeap() {
        for (int i = 0; i < size; i++) {
            System.out.print(heap[i] + " ");
        }
        System.out.println();
    }

    // ----------- Driver Code -----------
    public static void main(String[] args) {
        MaxHeap h = new MaxHeap(20);

        // Test Insert
        h.insert(50);
        h.insert(30);
        h.insert(20);
        h.insert(15);
        h.insert(10);
        h.insert(40);

        System.out.println("Heap after insertions:");
        h.printHeap();

        // Test Delete Root
        System.out.println("Deleted root: " + h.deleteRoot());
        h.printHeap();

        // Test Build Heap from array
        int arr[] = {12, 11, 13, 5, 6, 7};
        h.buildHeap(arr);
        System.out.println("Heap built from array:");
        h.printHeap();
    }
}
