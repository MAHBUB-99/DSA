import java.util.HashMap;
import java.util.Scanner;
import java.util.Stack;

public class ValidParentheses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string of parentheses: ");
        String input = scanner.nextLine();

        boolean result = isValid(input);
        System.out.println("Is valid: " + result);

        scanner.close();
    }

    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        HashMap<Character,Character> hashMap = new HashMap<>();

        hashMap.put(')','(');
        hashMap.put('}','{');
        hashMap.put(']','[');

        for(int i=0;i<s.length();i++)
        {
            if(stack.empty())
            {
                stack.push(s.charAt(i));
            }
            else if(stack.peek()==hashMap.get(s.charAt(i)))
            {
                stack.pop();
            }
            else if(stack.peek()!=hashMap.get(s.charAt(i)))
            {
                stack.push(s.charAt(i));
            }
        }
        if(stack.empty()) return true;
        return false; // placeholder
    }
}
