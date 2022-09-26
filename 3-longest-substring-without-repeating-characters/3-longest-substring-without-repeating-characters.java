class Solution {
    public int lengthOfLongestSubstring(String s) {
        //Sliding Window Approach
        
        //Declare the DS
        int pointerA = 0;
        int pointerB = 0;
        int max =  0;
        HashSet<Character> hashSet = new HashSet<Character>();
        
        while(pointerB < s.length()){
            if(!hashSet.contains(s.charAt(pointerB))){
                hashSet.add(s.charAt(pointerB));
                pointerB++;
                max = Math.max(max , hashSet.size());
            }else{
                hashSet.remove(s.charAt(pointerA));
                pointerA++;
            }
        }
        
        return max;
        
    }
}