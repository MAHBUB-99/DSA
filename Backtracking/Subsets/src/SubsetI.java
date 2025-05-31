import java.util.ArrayList;
import java.util.List;

public class SubsetI {
    List<List<Integer>> result = new ArrayList<>();

    public void findSubset(int[] nums, List<Integer> ans, int i) {
        if (i == nums.length) {
            result.add(new ArrayList<>(ans)); // Add a deep copy of current subset
            return;
        }

        // Include nums[i]
        ans.add(nums[i]);
        findSubset(nums, ans, i + 1);

        // Exclude nums[i] (backtrack)
        ans.remove(ans.size() - 1);
        findSubset(nums, ans, i + 1);
    }

    public List<List<Integer>> subsets(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        findSubset(nums, ans, 0);
        return result;
    }

    public static void main(String[] args) {
        SubsetI obj = new SubsetI();
        int[] nums = {1, 2, 3};
        List<List<Integer>> output = obj.subsets(nums);

        for (List<Integer> subset : output) {
            System.out.println(subset);
        }
    }
}
