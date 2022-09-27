class Solution {
    public int uniquePaths(int m, int n) {
        //Dynamic Programming Approach
        int[][] dp = new int[m][n];
        for(int[] row : dp) Arrays.fill(row,-1);
        
        int i = 0 , j = 0;
        
        
        return countPaths(i , j , m ,n, dp);
    }
    public int countPaths(int i , int j , int m , int n, int[][] dp){
        //Edge cases - Boundary
        if(i >= m || j >= n) return 0;
        
        //Edge cases - Goal Reached
        if(i == m - 1 && j == n - 1) return 1;
        
        if(dp[i][j] != -1) return dp[i][j];
        return dp[i][j] = countPaths(i , j + 1 , m ,n, dp) + countPaths(i + 1 , j , m ,n, dp);
        
    }
}