import java.util.*;

public class TwoSum {
    public int[] findtwoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i]))
                return new int[]{map.get(target - nums[i]), i}; // fixed order
            map.put(nums[i], i);
        }
        return new int[]{};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input array length
        System.out.println("Enter size of array:");
        int n = sc.nextInt();

        // Input array elements
        int[] nums = new int[n];
        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        // Input target
        System.out.println("Enter target:");
        int target = sc.nextInt();

        // Call twoSum function
        TwoSum sol = new TwoSum();
        int[] result = sol.findtwoSum(nums, target);

        // Print result
        if (result.length == 2)
            System.out.println("Indices: " + result[0] + ", " + result[1]);
        else
            System.out.println("No pair found!");
    }
}
