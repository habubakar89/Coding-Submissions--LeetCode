class Solution {
    public void sortColors(int[] nums) {
        if(nums.length == 0) return;
        
        int start = 0 , end  = nums.length - 1 , index = 0;
        
        while(start <= end && index <= end){
            if(nums[index] == 0){
                nums[index] = nums[start];
                nums[start] = 0;
                index++;
                start++;
            }    
            else if(nums[index] == 2){
                nums[index] = nums[end];
                nums[end] = 2;
                end--;
                
            }
            else index++;
        }
        
        
    }
}