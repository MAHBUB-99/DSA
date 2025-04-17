import java.util.Arrays;

class RotateArray {
    public static void rotate(int[] nums, int k) {
        k = k% nums.length;
        reverse(nums,0,nums.length-1);
        reverse(nums,0,k-1);
        reverse(nums,k,nums.length-1);
    }

    public static void reverse(int[] nums, int start, int end) {
        while(start < end)
        {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 4, 5, 6, 7};
        int k1 = 10;
        rotate(nums1, k1);
        System.out.println(Arrays.toString(nums1)); // Expected Output: [5,6,7,1,2,3,4]

        int[] nums2 = {-1, -100, 3, 99};
        int k2 = 2;
        rotate(nums2, k2);
        System.out.println(Arrays.toString(nums2)); // Expected Output: [3,99,-1,-100]
    }
}
