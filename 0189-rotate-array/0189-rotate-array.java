class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        if(n <= 1) return;
        k %= n;
        reverse(nums , 0 , n - k - 1);
        reverse(nums , n - k , n - 1);
        reverse(nums , 0 , n - 1);
    }
    public void reverse(int[] nums , int start ,int end){
        while(start <= end){
            int temp = nums[end];
            nums[end] = nums[start];
            nums[start] = temp;
            start++;
            end--;
        }
    }
}