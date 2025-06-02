import java.util.ArrayList;
import java.util.List;

public class Combination {
    List<List<Integer>> result = new ArrayList<>();

    public void getCombine(int start, int n, int k, List<Integer> ans, int idx) {
        if (idx == k) {
            result.add(new ArrayList<>(ans));
            return;
        }
        for (int i = start; i <= n; i++) {
            ans.add(i);
            getCombine(i + 1, n, k, ans, idx + 1);
            ans.remove(ans.size() - 1);  // remove last element, better than remove(Integer.valueOf(i))
        }
    }

    public List<List<Integer>> combine(int n, int k) {
        List<Integer> ans = new ArrayList<>();
        getCombine(1, n, k, ans, 0);
        return result;
    }

    public static void main(String[] args) {
        Combination obj = new Combination();
        int n = 4;
        int k = 3;
        List<List<Integer>> combinations = obj.combine(n, k);

        System.out.println("Combinations of " + n + " choose " + k + ":");
        for (List<Integer> combo : combinations) {
            System.out.println(combo);
        }
    }
}
