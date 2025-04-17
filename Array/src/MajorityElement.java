import java.util.Arrays;
public class MajorityElement {
    public static void majorityElement(int[] nums) {
        Arrays.sort(nums);
        for(int i=0; i<=nums.length/2; i++)
        {
            int count = 1;
            for(int j=i+1; j<nums.length; j++)
            {
                if(nums[i] == nums[j]) {
                    count++;
                }
                if(count > nums.length/2)
                    System.out.println(nums[i] +"  :  Count:  "+count);
            }

        }
    }

    public static void main(String[] args) {
        //Example 1
        int[] nums1 = {3, 2, 3};
        majorityElement(nums1);

//        // Example 2
        int[] nums2 = {2, 2, 1, 1, 1, 2, 2};
        majorityElement(nums2);
    }
}
