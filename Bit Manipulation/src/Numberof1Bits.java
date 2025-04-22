import java.util.Scanner;

public class Numberof1Bits {

    public int hammingWeight(int n) {
        int counter = 0;
        for (int i = 0; i < 32; i++) {
            if (((n >> i) & 1) == 1)
                counter++;
        }
        return counter;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer (can be negative): ");
        int n = scanner.nextInt();

        Numberof1Bits obj = new Numberof1Bits();
        int result = obj.hammingWeight(n);

        System.out.println("Number of 1 bits in binary representation: " + result);
    }
}
