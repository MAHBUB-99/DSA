import java.util.*;

public class HappyNumber {
    public int getSum(int num) {
        int sum = 0;
        while (num > 0) {
            sum += (num % 10) * (num % 10);
            num /= 10;
        }
        return sum;
    }
    public boolean isHappy(int n) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int first_sum = getSum(n);
        int index = 0;

        if (first_sum == 1)
            return true;

        map.put(index, first_sum);

        while (true) {
            int sum = getSum(map.get(index));
            if (sum == 1)
                return true;
            if (map.containsValue(sum))
                return false;
            index = index + 1;
            map.put(index, sum);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input number
        System.out.print("Enter a number to check if it's a Happy Number: ");
        int n = sc.nextInt();

        HappyNumber sol = new HappyNumber();
        boolean result = sol.isHappy(n);

        // Output result
        if (result) {
            System.out.println(n + " is a Happy Number.");
        } else {
            System.out.println(n + " is NOT a Happy Number.");
        }

        sc.close();
    }
}
