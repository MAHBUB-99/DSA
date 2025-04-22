import java.util.Scanner;

public class ReverseBits {

    // You need to treat n as an unsigned value
    public int reverseBits(int n) {
        int rev = 0;
        for (int i = 0; i < 32; i++) {
            rev = (rev << 1) | ((n >> i) & 1);
        }
        return rev;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer (as 32-bit signed value): ");
        int n = scanner.nextInt();

        ReverseBits obj = new ReverseBits();
        int result = obj.reverseBits(n);

        System.out.println("Reversed bits as integer: " + result);
        System.out.println("Reversed bits as unsigned long: " + (result & 0xFFFFFFFFL));
    }
}
