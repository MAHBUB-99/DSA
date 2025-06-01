import java.util.*;
public class SubsetII {
    List<List<Integer>> result = new ArrayList<>();
    public void findSubset(int[] nums, List<Integer> ans, int i) {
        if (i == nums.length) {
            if (!result.contains(new ArrayList<>(ans))) {
                result.add(new ArrayList<>(ans));
                return;
            }
            return;
        }

        ans.add(nums[i]);
        findSubset(nums, ans, i + 1);

        ans.remove(ans.size() - 1);
        findSubset(nums, ans, i + 1);
    }

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        Arrays.sort(nums);
        findSubset(nums, ans, 0);
        return result;
    }
    public static void main(String[] args) {
        SubsetII obj = new SubsetII();
        int[] nums = {4, 4, 4, 1, 4};
        List<List<Integer>> subsets = obj.subsetsWithDup(nums);

        for (List<Integer> subset : subsets) {
            System.out.println(subset);
        }
    }
}
