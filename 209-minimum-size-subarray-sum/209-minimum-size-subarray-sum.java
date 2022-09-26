class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        //Sliding window approach
        
        //Declare the DS
        int result = Integer.MAX_VALUE;
        int sum = 0;
        int left = 0;
        
        //Loop through the Array
        for(int i = 0; i < nums.length ; i++){
            sum += nums[i];
            
            while(sum >= target){
                result = Math.min(result , i - left + 1);
                sum -= nums[left];
                left++;
            }
        }
        
        
        
        return (result != Integer.MAX_VALUE) ? result : 0;
        
    }
}