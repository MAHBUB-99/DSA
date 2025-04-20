import java.util.*;

class RansomNote {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> m_map = new HashMap<>();

        for (Character c : magazine.toCharArray()) {
            m_map.put(c, m_map.getOrDefault(c, 0) + 1);
        }

        for (Character c : ransomNote.toCharArray()) {
            if (!m_map.containsKey(c) || m_map.get(c) == 0) {
                return false;
            }
            m_map.put(c, m_map.get(c) - 1);
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        RansomNote sol = new RansomNote();

        // 📥 Taking input
        System.out.print("Enter ransomNote: ");
        String ransomNote = sc.nextLine();

        System.out.print("Enter magazine: ");
        String magazine = sc.nextLine();

        // ✅ Calling method and printing result
        boolean result = sol.canConstruct(ransomNote, magazine);
        System.out.println("Can construct: " + result);

        sc.close();
    }
}
