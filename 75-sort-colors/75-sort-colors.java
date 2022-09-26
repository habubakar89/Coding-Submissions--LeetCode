class Solution {
    public void sortColors(int[] nums) {
        //Two pointer approach
        
        //Edge case removal
        if(nums.length == 0 || nums.length == 1) return;
        
        //Declare the DS
        int index = 0;
        int start = 0 , end = nums.length - 1;
        
        while(start <= end && index <= end){
            if(nums[index] == 0){
                nums[index] = nums[start];
                nums[start] = 0;
                start++;
                index++;
            }else if(nums[index] == 2){
                nums[index] = nums[end];
                nums[end] = 2;
                end--;
                
            }else{
                index++;
            }
        }
        
    }
}