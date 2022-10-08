class Solution {
    public void moveZeroes(int[] nums) {
        int i = 0;
        for(i = 0 ; i < nums.length ; i++){
            if(nums[i] == 0) break;
        }
        for(int j = i  , k = i + 1 ; k < nums.length ; k++){
            if(nums[k] != 0){
                int temp = nums[k];
                nums[k] = nums[j];
                nums[j] = temp;
                j++;
            }
        }
    }
}