// { Driver Code Starts
// Initial Template for Java
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while (T-- > 0) {
            String[] s = br.readLine().trim().split(" ");
            int V = Integer.parseInt(s[0]);
            int E = Integer.parseInt(s[1]);
            ArrayList<ArrayList<Integer>> adj =
                new ArrayList<ArrayList<Integer>>();
            for (int i = 0; i < V; i++) adj.add(new ArrayList<Integer>());
            for (int i = 0; i < E; i++) {
                String[] S = br.readLine().trim().split(" ");
                int u = Integer.parseInt(S[0]);
                int v = Integer.parseInt(S[1]);
                adj.get(u).add(v);
                adj.get(v).add(u);
            }
            Solution obj = new Solution();
            ArrayList<Integer> ans = obj.dfsOfGraph(V, adj);
            for (int i = 0; i < ans.size(); i++)
                System.out.print(ans.get(i) + " ");
            System.out.println();
        }
    }
}
// } Driver Code Ends


class Solution {
    // Function to return a list containing the DFS traversal of the graph.
    public ArrayList<Integer> dfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        
        //Declare the DS
        ArrayList<Integer> dfsList = new ArrayList<Integer>();
        boolean[] visited = new boolean[V];
        
        /
        dfs(0 , adj , dfsList , visited);
        
        return dfsList;
        
    }
    
    //Recursive DFS Function
    public void dfs(int node , ArrayList<ArrayList<Integer>> adj , ArrayList<Integer> dfsList , boolean[] visited){
       
       //Add the current node and mark it visited
        visited[node] = true;
        dfsList.add(node);
        
        //Go through the neighbours of the current node
        for(int it : adj.get(node)){
            if(!visited[it]) dfs(it , adj , dfsList , visited);
        }
        
    }
}