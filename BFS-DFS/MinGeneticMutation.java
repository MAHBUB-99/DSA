import java.util.*;

public class MinGeneticMutation {

    static class Solution {
        public int minMutation(String startGene, String endGene, String[] bank) {
            HashSet<String> hBank = new HashSet<>(Arrays.asList(bank));
            HashSet<String> visited = new HashSet<>();
            Queue<String> q = new LinkedList<>();

            int level = 0;
            visited.add(startGene);
            q.add(startGene);

            while (!q.isEmpty()) {
                int size = q.size();
                for (int i = 0; i < size; i++) {
                    String cur = q.poll();
                    if (cur.equals(endGene))
                        return level;
                    char[] charArr = cur.toCharArray();
                    for (int j = 0; j < charArr.length; j++) {
                        char old = charArr[j];
                        for (char c : "ACGT".toCharArray()) {
                            charArr[j] = c;
                            String mutated = new String(charArr);
                            if (!visited.contains(mutated) && hBank.contains(mutated)) {
                                visited.add(mutated);
                                q.add(mutated);
                            }
                        }
                        charArr[j] = old;
                    }
                }
                level++;
            }
            return -1;
        }
    }

    public static void main(String[] args) {
        Solution sol = new Solution();

        String startGene = "AACCGGTT";
        String endGene = "AAACGGTA";
        String[] bank = {"AACCGGTA", "AACCGCTA", "AAACGGTA"};

        int result = sol.minMutation(startGene, endGene, bank);
        System.out.println("Minimum mutations needed: " + result);
    }
}
