import java.util.Scanner;
import java.util.Stack;

class Solution {
    public String simplifyPath(String path) {
        String[] arr = path.split("/");
        Stack<String> stack = new Stack<>();
        for(int i=0;i<arr.length;i++)
        {
            if(!arr[i].isEmpty())
            {
                if(!arr[i].equals(".."))
                {
                    stack.push(arr[i]);
                }
                else
                {
                    if(!stack.isEmpty())
                    {
                        stack.pop();
                    }
                }
            }
        } 
        StringBuilder result = new StringBuilder();
        for(String c: stack)
        {
            System.out.println(c);
            result.append("/").append(c);
        }
        if(result.length()==0)
        {
            result.append("/");
        }
        return result.toString();
    }
}

public class SimplifyPath {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a UNIX-style path: ");
        String inputPath = scanner.nextLine();

        Solution solution = new Solution();
        String simplified = solution.simplifyPath(inputPath);

        System.out.println("Simplified Path: " + simplified);
        scanner.close();
    }
}
