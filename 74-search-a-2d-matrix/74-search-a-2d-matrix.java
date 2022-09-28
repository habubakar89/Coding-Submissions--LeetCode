class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int low = 0;
        
        int m = matrix.length;
        int n = matrix[0].length;
        
        int high = (m * n) - 1;
        
        if(matrix.length == 0) return false;
        
        while(low <= high){
            
            int mid = (low + (high - low)/2);
            
            int current = matrix[mid / n][mid % n];
            
            if(current  == target) return true;
            
            if(target < current) high = mid - 1;
            
            else low = mid + 1;
            
        }
        
        return false;
    }
}