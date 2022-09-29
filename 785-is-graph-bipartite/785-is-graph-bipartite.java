class Solution {
    public boolean isBipartite(int[][] graph) {
        int len = graph.length;
        int[] visited = new int[len];
        Arrays.fill(visited , -1);
        
        for(int i = 0 ; i < len ; i++){
            if(visited[i] == -1){
                if(!checkBFS(i , graph , visited)) return false;
            }
        }
          
        return true;
    }
    
    public boolean checkBFS(int node , int[][] graph , int[] visited){
        Queue<Integer> queue = new LinkedList<>();
        visited[node] = 1;
        queue.add(node);
        
        while(!queue.isEmpty()){
            int currentNode = queue.poll();
            
            for(int it : graph[currentNode]){
                if(visited[it] == -1){
                    visited[it] = 1 - visited[currentNode];
                    queue.add(it);
                    
                }
                else if(visited[it] == visited[currentNode]) return false;
            }
            
        }
            
            
        
        
        return true;
    }
}