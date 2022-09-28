class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int low = 0;
        int n = matrix.length;
        int m = matrix[0].length;
        int high = (m * n) - 1;
        
        if(matrix.length == 0) return false;
        
        while(low <= high){
            int mid = (low + (high - low) / 2);
            int curr = matrix[mid / m][mid % m];
            if(curr == target) return true;
            if (curr < target) low = mid + 1;
            else high = mid - 1;
        }
        
        return false;
        
    }
}