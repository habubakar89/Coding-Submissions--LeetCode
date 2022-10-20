class Solution {
//     public int singleNonDuplicate(int[] nums) {
//         if(nums.length == 0) return 0;
//         if(nums.length == 1) return nums[0];
//         int low = 0 , high = nums.length - 1;
        
//         while(low <= high){
//             int mid = low + (high - low) / 2;
            
//             if((mid % 2 == 0 && nums[mid] == nums[mid + 1]) || (mid % 2 == 1 && nums[mid] == nums[mid - 1])) low = mid + 1;
//             else high = mid - 1;
                
//         }
    
//     return nums[low];
//     }
     public int singleNonDuplicate(int[] nums) {
        int left = 0, right = nums.length-1;
        while(left < right){
            int mid = (left + right)/2;
            if( (mid % 2 == 0 && nums[mid] == nums[mid +1]) || (mid %2 == 1 && nums[mid] == nums[mid - 1]) )
                left = mid + 1;
            else
                right = mid;
        }
        return nums[left];
     }
}


