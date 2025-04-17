class JumpGame {
    /**
     * Problem Summary:
     * - You are given an array `nums`, where `nums[i]` represents the maximum jump length from index `i`.
     * - Starting at index 0, determine if you can reach the last index.
     * - Return `true` if it's possible, otherwise return `false`.
     * <p>
     * Example 1:
     * Input:  nums = [2,3,1,1,4]
     * Output: true
     * Explanation: Jump 1 step from index 0 to 1, then 3 steps to the last index.
     * <p>
     * Example 2:
     * Input:  nums = [3,2,1,0,4]
     * Output: false
     * Explanation: You always reach index 3, which has a jump length of 0, making it impossible to continue.
     * <p>
     * Constraints:
     * - 1 <= nums.length <= 10^4
     * - 0 <= nums[i] <= 10^5
     */

    public boolean canJump(int[] nums) {
        int jump=0,i=0;
        while(i<nums.length)
        {
            if(jump<i)
            {
                return false;
            }
            jump=Math.max(jump,i+nums[i]);
            i++;
        }
        return true;
    }

    public static void main(String[] args) {
        JumpGame sol = new JumpGame();

        int[] nums1 = {2, 3, 1, 1, 4};
        System.out.println(sol.canJump(nums1)); // Expected Output: true

        int[] nums2 = {3,2,1,0,4};
        System.out.println(sol.canJump(nums2)); // Expected Output: false

        // Test case 3: Single element (trivially possible)
        int[] nums3 = {0};
        System.out.println(sol.canJump(nums3)); // Expected Output: true

        // Test case 4: Large jumps (direct jump possible)
        int[] nums4 = {5, 4, 3, 2, 1, 0, 4};
        System.out.println(sol.canJump(nums4)); // Expected Output: true

        // Test case 5: All zeros except start (only possible if first element is 0)
        int[] nums5 = {0, 0, 0, 0};
        System.out.println(sol.canJump(nums5)); // Expected Output: true (since it's already at the last index)

        // Test case 6: Large input with no possible path
        int[] nums6 = {2, 5, 0, 0};
        System.out.println(sol.canJump(nums6)); // Expected Output: false
    }
}
