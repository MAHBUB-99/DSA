import java.util.*;

public class IsomorphicString {
    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length())
            return false;

        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            map1.putIfAbsent(s.charAt(i), i);
            map2.putIfAbsent(t.charAt(i), i);

            if (!map1.get(s.charAt(i)).equals(map2.get(t.charAt(i))))
                return false;
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first string:");
        String s = sc.nextLine();

        System.out.println("Enter second string:");
        String t = sc.nextLine();

        IsomorphicString sol = new IsomorphicString();
        boolean result = sol.isIsomorphic(s, t);

        System.out.println("Result: " + result);
    }
}
