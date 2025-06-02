import java.util.*;

public class LetterCombinationPhone {
    static List<String> result = new ArrayList<>();

    public static void DFS(String digits, String ans, HashMap<Character, String> hash, int idx) {
        if (idx == digits.length()) {
            result.add(ans);
            return;
        }

        for (char c : hash.get(digits.charAt(idx)).toCharArray()) {
            DFS(digits, ans + c, hash, idx + 1);
        }
    }

    public static List<String> letterCombinations(String digits) {
        result.clear(); // Reset for fresh call
        if (digits == null || digits.length() == 0) {
            return result;
        }

        HashMap<Character, String> hash = new HashMap<>();
        hash.put('2', "abc");
        hash.put('3', "def");
        hash.put('4', "ghi");
        hash.put('5', "jkl");
        hash.put('6', "mno");
        hash.put('7', "pqrs");
        hash.put('8', "tuv");
        hash.put('9', "wxyz");

        DFS(digits, "", hash, 0);
        return result;
    }

    public static void main(String[] args) {
        String digits = "23";
        List<String> combinations = letterCombinations(digits);

        System.out.println("Letter combinations for \"" + digits + "\":");
        for (String comb : combinations) {
            System.out.println(comb);
        }
    }
}
