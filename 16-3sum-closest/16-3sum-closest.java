import java.util.*;

class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int result = Integer.MAX_VALUE;
        int diff = Integer.MAX_VALUE;
        
        Arrays.sort(nums);
        
        int start = 0;
        int end = nums.length - 1;
        while(start+1<end){
            int rem = target - nums[start] - nums[end];
            int i = binarySearch(nums,rem,start+1,end-1);
            int currClosestSum = nums[i] + nums[start] + nums[end];
            
            if(diff>Math.abs(target - currClosestSum)){
                diff = Math.abs(target - currClosestSum);
                result = currClosestSum;
            }
            
            if(target==currClosestSum){
                return target;
            }
            
            else if(target<currClosestSum){
                end = end - 1;
            }
            
            else{
                start = start + 1;
            }
        }
        
        return result;
    }
    
    public int binarySearch(int[] A,int target,int start,int end){
        
        int left = start;
        int right = end;
        
        int res = -1;
        // this will give next greater element index
        while (start<=end) {
            int mid = start + (end - start) / 2;
            
            if (A[mid] <= target) {
                start = mid + 1;
            } else {
                res = mid;
                end = mid - 1;
            }
        }
		// if no greater element exist
        if(res==-1)
            return right;
        if(res==left)
            return left;
        
		// check if greater element will be better to pick or the number before that
        if(Math.abs(A[res-1]-target)<Math.abs(A[res]-target))
            return res-1;
        return res;
    }
}