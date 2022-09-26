class Solution {
    public int[] productExceptSelf(int[] nums) {
        //Right and Left - Two pointer approach
        
        //Declare the DS
        int[] left = new int[nums.length];
        int[] right = new int[nums.length];
        int[] output = new int[nums.length];
        
        
        left[0] = 1;
        right[nums.length - 1] = 1;
        
        //Values before
        for(int i = 1 ; i < nums.length ; i++) left[i] = left[i - 1] * nums[i - 1];
        
        //Values after
        for(int i = nums.length - 2 ; i >= 0 ; i--) right[i] = right[i + 1] * nums[i + 1];
        
        //Cumulative Product
        for(int i = 0 ; i < nums.length ; i++) output[i] = left[i] * right[i];
        
        return output;
        
    }
}