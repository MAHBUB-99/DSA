import java.util.ArrayList;
import java.util.List;

public class GenerateValidParenthesis {
    List<String> result = new ArrayList<>();

    public void generate(String ans, int max, int open, int close) {
        if (ans.length() == max * 2) {
            result.add(ans);
            return;
        }
        if (open < max)
            generate(ans + "(", max, open + 1, close);
        if (close < open)
            generate(ans + ")", max, open, close + 1);
    }

    public List<String> generateParenthesis(int n) {
        generate("", n, 0, 0);
        return result;
    }
   
    public static void main(String[] args) {
        GenerateValidParenthesis obj = new GenerateValidParenthesis();
        int n = 3;
        List<String> combinations = obj.generateParenthesis(n);

        System.out.println("Valid Parentheses Combinations for n = " + n + ":");
        for (String s : combinations) {
            System.out.println(s);
        }
    }
}
