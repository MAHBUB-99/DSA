// Function to find BFS of Graph from given source s
import java.util.*;

class BFSGraph {

    static ArrayList<Integer> bfs(ArrayList<ArrayList<Integer>> adj) {
        int V = adj.size();
        int s = 0;
        ArrayList<Integer> res = new ArrayList<>();
        Queue<Integer> q = new LinkedList<>();
        boolean[] visited = new boolean[V];

        visited[s] = true;
        q.add(s);
        while(!q.isEmpty())
        {
            int curr = q.poll();
            res.add(curr);
            for(int n : adj.get(curr))
            {
                if(!visited[n])
                {
                    q.add(n);
                    visited[n] = true;
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        // create the adjacency list
        // { {2, 3, 1}, {0}, {0, 4}, {0}, {2} }
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        adj.add(new ArrayList<>(Arrays.asList(1, 2)));
        adj.add(new ArrayList<>(Arrays.asList(0, 2, 3)));
        adj.add(new ArrayList<>(Arrays.asList(0, 4)));
        adj.add(new ArrayList<>(Arrays.asList(1,4)));
        adj.add(new ArrayList<>(Arrays.asList(2,3)));

        ArrayList<Integer> ans = bfs(adj);
        for (int i : ans) {
            System.out.print(i + " ");
        }
    }
}