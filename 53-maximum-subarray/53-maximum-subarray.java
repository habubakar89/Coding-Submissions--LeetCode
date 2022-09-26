class Solution {
    public int maxSubArray(int[] nums) {
        //Sliding window approach
        
        //Edge case removal
        if(nums.length == 0 ) return 0;
        if(nums.length == 1 ) return nums[0];
        
        //Declare the DS
        int max = Integer.MIN_VALUE;
        int maxYet = 0;
        
        for(int i = 0 ; i < nums.length ; i++){
            maxYet += nums[i];
            max = Math.max(maxYet,max);
            if(maxYet < 0) maxYet = 0;
        }
        
        return max;
    }
}