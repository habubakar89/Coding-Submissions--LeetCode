class Solution {
    public int[] searchRange(int[] nums, int target) {
        if(nums.length < 1) return new int[] {-1 , -1};
        if(nums.length == 1 && nums[0] == target) return new int[] {0 , 0};
        int low = 0 , end = nums.length - 1;
        int first = -1 , last = -1;
        //First
        while(low <= end){
            int mid = low + (end - low) / 2;
            
            if(nums[mid] == target){
                first = mid;
                end = mid - 1;
            }
            else if(target > nums[mid]) low = mid + 1;
            else end = mid - 1;
            
        }
        //Last
        low = 0;
        end = nums.length - 1;
        while(low <= end){
            int mid = low + (end - low) / 2;
            
            if(nums[mid] == target){
                last = mid;
                low = mid + 1;
            }
            else if(target > nums[mid]) low = mid + 1;
            else end = mid - 1;
            
        }
        
        return new int[] {first , last};
    }
}