// { Driver Code Starts
import java.util.*;
import java.io.*;
import java.lang.*;

class DriverClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            ArrayList<ArrayList<Integer>> list = new ArrayList<>();
            int V = sc.nextInt();
            int E = sc.nextInt();
            for (int i = 0; i < V + 1; i++)
                list.add(i, new ArrayList<Integer>());
            for (int i = 0; i < E; i++) {
                int u = sc.nextInt();
                int v = sc.nextInt();
                list.get(u).add(v);
            }
            if (new Solution().isCyclic(V, list) == true)
                System.out.println("1");
            else
                System.out.println("0");
        }
    }
}// } Driver Code Ends


/*Complete the function below*/

class Solution {
    // Function to detect cycle in a directed graph.
    public boolean isCyclic(int V, ArrayList<ArrayList<Integer>> adj) {
        //Declare the DS
        int[] indegree = new int[V];
        Queue<Integer> queue = new LinkedList<>();
        
        //Calculate the indegree for the nodes
        for(int i = 0 ; i < V ; i++){
            for(int it : adj.get(i)) indegree[it]++;
        }
        
        //Adding nodes with indegree = 0 to the queue
        for(int i = 0 ; i < V ; i++){
            if(indegree[i] == 0) queue.add(i);
        }
        
        int count = 0;
        
        //BFS
        while(!queue.isEmpty()){
            int node = queue.poll();
            count++;
            for(int it : adj.get(node)){
                indegree[it]--;
                if(indegree[it] == 0) queue.add(it);
            }
        }
        if(V == count) return false;
        return true;
    }
}