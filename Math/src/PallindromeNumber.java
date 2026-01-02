import java.util.Scanner;

class PallindromeNumber {
    public boolean isPalindrome(int x)
    {
        int reverse =0 ;
        int original =x;
        if(x<0)
            return false;
        while(x>0)
        {
            reverse = reverse*10 + (x%10);
            x/=10;
        }
        System.out.println(reverse);

        return original==reverse;

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        PallindromeNumber solution = new PallindromeNumber();
        boolean result = solution.isPalindrome(number);

        if (result) {
            System.out.println(number + " is a palindrome.");
        } else {
            System.out.println(number + " is not a palindrome.");
        }
        scanner.close();
    }
}
