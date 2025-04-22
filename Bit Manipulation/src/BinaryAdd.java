import java.util.Scanner;

public class BinaryAdd {

    public String addBinary(String a, String b) {
        StringBuilder result = new StringBuilder();
        int carry = 0;

        int i = a.length() - 1;
        int j = b.length() - 1;

        while (i >= 0 || j >= 0 || carry > 0) {
            int sum = carry;
            if (i >= 0)
                sum += a.charAt(i--) - '0';
            if (j >= 0)
                sum += b.charAt(j--) - '0';

            result.append(sum % 2);
            carry = sum / 2;
        }

        return result.reverse().toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first binary number: ");
        String a = scanner.nextLine();

        System.out.print("Enter second binary number: ");
        String b = scanner.nextLine();

        BinaryAdd obj = new BinaryAdd();
        String result = obj.addBinary(a, b);

        System.out.println("Binary Sum: " + result);
    }
}
