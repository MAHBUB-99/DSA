import java.util.*;

public class ValidAnagram {

    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length())
            return false;

        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            map1.put(s.charAt(i), map1.getOrDefault(s.charAt(i), 0) + 1);
            map2.put(t.charAt(i), map2.getOrDefault(t.charAt(i), 0) + 1);
        }

        return map1.equals(map2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input first string
        System.out.println("Enter first string:");
        String s = sc.nextLine();

        // Input second string
        System.out.println("Enter second string:");
        String t = sc.nextLine();

        // Create Solution object and call method
        ValidAnagram sol = new ValidAnagram();
        boolean result = sol.isAnagram(s, t);

        // Output result
        System.out.println("Are they anagrams?::: -  " + result);
    }
}
