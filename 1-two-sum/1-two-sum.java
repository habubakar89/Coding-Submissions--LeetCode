class Solution {
    public int[] twoSum(int[] nums, int target) {
        //Declare the DS
        int[] array = new int[2];
        Map<Integer,Integer> hashMap = new HashMap<Integer,Integer>();
        
        for(int i = 0 ; i < nums.length ; i++){
            if(hashMap.containsKey(target - nums[i])){
                array[0]=hashMap.get(target - nums[i]);
                array[1] = i;
                return array;
            }
            hashMap.put(nums[i],i);
        }
        
        
        return array;
    }
}