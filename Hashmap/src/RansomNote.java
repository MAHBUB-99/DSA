class RansomNote {
    public boolean canConstruct(String ransomNote, String magazine) {
        // TODO: implement logic here
        return false; // placeholder
    }

    public static void main(String[] args) {
        RansomNote sol = new RansomNote();

        // 🧪 Test Input Examples
        String ransomNote1 = "a";
        String magazine1 = "b";
        System.out.println(sol.canConstruct(ransomNote1, magazine1)); // false

        String ransomNote2 = "aa";
        String magazine2 = "ab";
        System.out.println(sol.canConstruct(ransomNote2, magazine2)); // false

        String ransomNote3 = "aa";
        String magazine3 = "aab";
        System.out.println(sol.canConstruct(ransomNote3, magazine3)); // true
    }
}
