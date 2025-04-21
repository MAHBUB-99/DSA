import java.util.*;

public class ContainsDuplicateII {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input array size
        System.out.print("Enter number of elements in array: ");
        int n = sc.nextInt();

        int[] nums = new int[n];
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        // Input k
        System.out.print("Enter value of k: ");
        int k = sc.nextInt();

        // Create Solution object and call method
        Solution sol = new Solution();
        boolean result = sol.containsNearbyDuplicate(nums, k);

        // Output result
        System.out.println("Contains nearby duplicate: " + result);

        sc.close();
    }
}

class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                if ((i - map.get(nums[i])) <= k)
                    return true;
            }
            map.put(nums[i], i); // always update the latest index
        }
        return false;
    }
}
