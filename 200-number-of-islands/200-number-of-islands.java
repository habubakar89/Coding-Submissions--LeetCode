class Solution {
    public int numIslands(char[][] grid) {
        int numIslands = 0;
        for(int i = 0 ; i < grid.length ; i++){
            for(int j = 0; j < grid[0].length ; j++){
                if(grid[i][j] == '1'){
                    numIslands++;
                    dfs(i , j , grid);
                }
            }
        }
        return numIslands;
    }
    public void dfs(int i , int j , char[][] grid){
        int m = grid.length;
        int n = grid[0].length;
        if(i < 0 || j < 0 || i >= m || j >= n || grid[i][j] == '0') return;
        grid[i][j] = '0';
        dfs(i + 1 , j , grid);
        dfs(i , j + 1, grid);
        dfs(i - 1 , j, grid);
        dfs(i , j - 1, grid);
        
    }
}