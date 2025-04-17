class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;
        int j = n - 1;
        int index = m + n - 1;
        while (i >= 0 && j >= 0) {
            nums1[index--] = (nums1[i] >= nums2[j]) ? nums1[i--] : nums2[j--];
        }
        while(j>=0)
        {
            nums1[index--] = nums2[j--];
        }
    }

    public static void main(String[] args) {
        // Example test cases
        int[] nums1 = {2, 2, 3, 4, 0, 0, 0, 0, 0, 0, 0};
        int m = 4;
        int[] nums2 = {1, 1, 1, 2, 5, 6, 7};
        int n = 7;

        MergeSortedArray solution = new MergeSortedArray();
        solution.merge(nums1, m, nums2, n);

        // Print result
        System.out.println(java.util.Arrays.toString(nums1)); // Expected: [1,2,2,3,5,6]
    }
}
