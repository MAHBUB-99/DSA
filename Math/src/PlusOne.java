import java.sql.SQLOutput;
import java.util.Scanner;

public class PlusOne {
    public int[] Solution(int[] digits)
    {
        for(int i=digits.length-1;i>=0;i--)
        {
            if(digits[i]!=9)
            {
                digits[i]+=1;
                return digits;
            }
            else if(digits[i]==9)
                digits[i] = 0;
        }
        int[] newDigits= new int[digits.length+1];
        newDigits[0] = 1;
        return newDigits;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of digits: ");
        int n = scanner.nextInt();

        int[] digits = new int[n];
        System.out.println("Enter the digits (space-separated):");
        for(int i=0;i<n;i++)
        {
            digits[i]=scanner.nextInt();
        }

        PlusOne solution = new PlusOne();
        int[] result = solution.Solution(digits);

        System.out.println("Result: ");
        for(int num: result)
        {
            System.out.print(num+ " ");
        }
    }
}
