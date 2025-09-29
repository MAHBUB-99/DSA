
public class Main {
    static void heapify(int[]arr,int n,int i)
    {
        int large = i;
        int l = 2*i+1;
        int r = 2*i+2;
        if(l<n && arr[l]>arr[large])
            large = l;
        if(r<n && arr[r]>arr[large])
            large = r;

        if(large != i)
        {
            int temp = arr[large];
            arr[large] = arr[i];
            arr[i] = temp;
            heapify(arr,n,large);
//            printArray(arr);
        }
    }

    static void heapSort(int[]arr)
    {
        int n = arr.length;
        for(int i = n/2-1;i>=0;i--)
        {
            heapify(arr,n,i);
        }
//        printArray(arr);
        for(int i = n-1;i>0;i--)
        {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            printArray(arr);


            heapify(arr,i,0);
            printArray(arr);
        }
    }
    static void printArray(int[]arr)
    {
        for(int i:arr)
        {
            System.out.print(i+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = {9, 4, 3, 8, 10, 2, 5};
        heapSort(arr);
        System.out.println("Sorted array is ");
        printArray(arr);
    }
}