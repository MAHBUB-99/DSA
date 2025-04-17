class RemoveDuplicate2 {
    public int removeDuplicates(int[] nums) {
        if (nums.length <= 2) return nums.length; // If array has at most 2 elements, return its length

        int index = 2; // Start from the third position (allowing two duplicates max)

        for (int i = 2; i < nums.length; i++) {
            if (nums[i] != nums[index - 2]) { // Compare with the element two places before
                nums[index] = nums[i]; // Place the valid element at the next position
                index++; // Move index forward
            }
        }

        return index; // k: The count of unique elements appearing at most twice
    }

    public static void main(String[] args) {
        RemoveDuplicate2 solution = new RemoveDuplicate2();

        int[] nums = {1,1,1,2,2,3};
        int k = solution.removeDuplicates(nums);

        System.out.println("k = " + k);
        System.out.print("Modified nums: [");
        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + (i < k - 1 ? ", " : ""));
        }
        System.out.println("]");
    }
}
