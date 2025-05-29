import java.util.*;
public class DFSGraph {

    public static ArrayList<Integer> DFSHelper(ArrayList<ArrayList<Integer>> adj,int s,boolean[] visited,ArrayList<Integer>result)
    {
        visited[s] = true;
        result.add(s);
        for(int n : adj.get(s))
        {
            if(!visited[n])
            {
                DFSHelper(adj,n,visited,result);
            }
        }
        return result;
    }
    public static ArrayList<Integer> DFS(ArrayList<ArrayList<Integer>>adj)
    {
        boolean []visited = new boolean[adj.size()];
        ArrayList<Integer> result = new ArrayList<>();
        return DFSHelper(adj,0,visited,result);
    }

    public static void addEdge(ArrayList<ArrayList<Integer> > adj, int s, int t)
    {
        adj.get(s).add(t);
        adj.get(t).add(s);
    }
    public static void main(String[] args) {
        int V = 6;
        ArrayList<ArrayList<Integer> > adj
                = new ArrayList<>();

        // Initialize adjacency list
        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }

        // Add edges
        int[][] edges= { { 1, 2 },{ 1, 0 },{ 2, 0 },{ 2, 3 },{ 2, 4 }, {0,5} };
        for (int[] e : edges)
        {
            addEdge(adj, e[0], e[1]);
        }

        System.out.println(adj);

        // Perform DFS starting from vertex 0
        ArrayList<Integer> res = DFS(adj);

        for (int i = 0; i < res.size(); i++) {
            System.out.print(res.get(i) + " ");
        }
    }
}
