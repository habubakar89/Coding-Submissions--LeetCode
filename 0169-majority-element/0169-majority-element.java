class Solution {
    public int majorityElement(int[] nums) {
        int value = 0 ;
        int count = 0;
        for(int num : nums){
            if(count == 0) value = num;
            if(num == value) count++;
            else count--;
        }
        return value;
    }
}