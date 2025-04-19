import java.util.Scanner;

class SingleNumber {
    public int singleNumber(int[] nums) {
        int res = 0;
        for (int num : nums) {
            res ^= num; // XOR cancels out duplicates
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = scanner.nextInt();

        int[] nums = new int[n];
        System.out.println("Enter the elements (all except one appear twice):");
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        SingleNumber solution = new SingleNumber();
        int result = solution.singleNumber(nums);

        System.out.println("The single number is: " + result);

        scanner.close();
    }
}
