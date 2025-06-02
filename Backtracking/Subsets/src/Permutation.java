import java.util.*;

public class Permutation {

    public static void swap(int[] nums, int a, int b) {
        if (a != b) {
            int temp = nums[a];
            nums[a] = nums[b];
            nums[b] = temp;
        }
    }

    public static void getPermutation(int[] nums, List<List<Integer>> result, int index) {
        if (index == nums.length) {
            List<Integer> newPerm = new ArrayList<>();
            for (int num : nums) {
                newPerm.add(num);
            }
            result.add(newPerm);
            return;
        }

        for (int i = index; i < nums.length; i++) {
            swap(nums, index, i);
            getPermutation(nums, result, index + 1);
            swap(nums, index, i); // backtrack
        }
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3}; // Example input

        List<List<Integer>> result = new ArrayList<>();
        getPermutation(nums, result, 0);

        for (List<Integer> perm : result) {
            System.out.println(perm);
        }
    }
}
