// { Driver Code Starts
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
            ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
            for (int i = 0; i < V; i++) adj.add(i, new ArrayList<Integer>());
            for (int i = 0; i < E; i++) {
                String[] S = br.readLine().trim().split(" ");
                int u = Integer.parseInt(S[0]);
                int v = Integer.parseInt(S[1]);
                adj.get(u).add(v);
                adj.get(v).add(u);
            }
            Solution obj = new Solution();
            boolean ans = obj.isCycle(V, adj);
            if (ans)
                System.out.println("1");
            else
                System.out.println("0");
        }
    }
}// } Driver Code Ends

class Node{
    int parent;
    int currentNode;
    public Node(int parent , int currentNode){
        this.parent = parent;
        this.currentNode = currentNode;
    }
}

class Solution {
    // Function to detect cycle in an undirected graph.
    public boolean isCycle(int V, ArrayList<ArrayList<Integer>> adj) {
        
        //Declare the DS
        boolean[] visited = new boolean[V];
        Arrays.fill(visited,false);
        
        //visited[0] = true;
        for(int i = 0 ; i < V ; i++){
            if(!visited[i]){
                if(checkForCycle(i , visited , adj)) return true;
            }
        }
        
        
        return false;
        
        
    }
    
    public boolean checkForCycle(int node , boolean[] visited , ArrayList<ArrayList<Integer>> adj){
        
        //Declare the DS
        Queue<Node> queue = new LinkedList<>();
        
        queue.add(new Node(-1 , node));
        visited[node] = true;
        
        while(!queue.isEmpty()){
            
            //Get the current node from the queue
            int currentNode = queue.peek().currentNode;
            int parent = queue.peek().parent;
            queue.remove();
            
            //Iterate throught the neighbours of the current node
            for(int it : adj.get(currentNode)){
                if(!visited[it]){
                    visited[it] = true;
                    queue.add(new Node(currentNode,it));
                }
                else if(it != parent) return true;
            }
            
        }
        return false;
    }
}