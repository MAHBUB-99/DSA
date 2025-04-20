import java.util.*;

public class WordPattern {
    public boolean CheckwordPattern(String pattern, String s) {
        String[] words = s.split(" ");
        if (pattern.length() != words.length)
            return false;

        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<String, Integer> map2 = new HashMap<>();

        for (int i = 0; i < pattern.length(); i++) {
            map1.putIfAbsent(pattern.charAt(i), i);
            map2.putIfAbsent(words[i], i);

            if (!map1.get(pattern.charAt(i)).equals(map2.get(words[i]))) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter pattern:");
        String pattern = sc.nextLine();

        System.out.println("Enter space-separated string:");
        String s = sc.nextLine();

        WordPattern sol = new WordPattern();
        boolean result = sol.CheckwordPattern(pattern, s);

        System.out.println("Result: " + result);
    }
}
