class Solution {
    public int missingNumber(int[] nums) {
        int N = nums.length;
        int sum = N * (N + 1) / 2;
        for(int i : nums) sum -= i;
        return sum;
    }
}