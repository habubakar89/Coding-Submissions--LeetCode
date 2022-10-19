class Solution {
    public boolean containsCycle(char[][] grid) {
        boolean[][] seen = new boolean[grid.length][grid[0].length];
        
        for(int i = 0 ; i < grid.length ; i++){
            for(int j = 0 ; j < grid[i].length ; j++){
                if(!seen[i][j] && dfs(grid , grid[i][j] , i , j , seen)) return true;
            }
        }
        return false;
    }
    
    public boolean dfs(char[][] grid , char target , int i , int j , boolean[][] seen){
        if(i < 0 || j < 0 || i >= grid.length || j >= grid[i].length || target != grid[i][j]) return false;
        if(seen[i][j]) return true;
        
        seen[i][j] = true;
        grid[i][j] = '%';
        boolean found = dfs(grid , target , i + 1 , j , seen) ||
            dfs(grid , target , i - 1, j , seen) ||
            dfs(grid , target , i , j + 1 , seen) ||
            dfs(grid , target , i , j - 1, seen);
        grid[i][j] = target;
        return found;
    }
    
}