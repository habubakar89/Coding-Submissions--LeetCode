class Solution {
    public int maxSubArray(int[] nums) {
        int maxTotal = Integer.MIN_VALUE;
        int maxYet = 0;
        for(int i = 0 ; i < nums.length ; i++){
            maxYet += nums[i];
            maxTotal = Math.max(maxTotal , maxYet);
            if(maxYet < 0) maxYet = 0;
            
        }
        return maxTotal;
    }
}