import java.util.Arrays;
public class TwoSumSortedArray {
    public static void main(String[] args) {
        // ✅ Input
        int[] numbers = {2, 7, 11, 15}; // Sorted array
        int target = 18;

        // ✅ Create Solution object and call the function
        Solution solution = new Solution();
        int[] result = solution.twoSum(numbers, target);

        // ✅ Output the result
        System.out.println("Output: " + Arrays.toString(result));
    }
}

class Solution {
    public int[] twoSum(int[] numbers, int target) {
        // 👉 Write your logic here
        int left=0,right=numbers.length-1;
        while(left<right)
        {
            if(numbers[left]+numbers[right] == target) return new int[]{left,right};
            else if(numbers[left]+numbers[right]<target) left+=1;
            else if (numbers[left]+numbers[right]>target) right-=1;
        }
        return new int[]{}; // placeholder return
    }
}
