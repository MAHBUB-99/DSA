import java.util.Scanner;

public class ANDofNumberRange {

    public int rangeBitwiseAnd(int left, int right) {
        int result = 0;
        while (left != right) {
            left = left >> 1;
            right = right >> 1;
            result++;
        }
        return left << result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter left value: ");
        int left = scanner.nextInt();

        System.out.print("Enter right value: ");
        int right = scanner.nextInt();

        ANDofNumberRange obj = new ANDofNumberRange();
        int result = obj.rangeBitwiseAnd(left, right);

        System.out.println("Bitwise AND of range [" + left + ", " + right + "] is: " + result);
    }
}
