class Solution {
    public int lengthOfLongestSubstring(String s) {
        //Sliding window Approach
        
        //Declare the DS
        int pointerA = 0;
        int pointerB = 0;
        int max = 0;
        HashSet<Character> map = new HashSet<Character>();
        
        while(pointerB < s.length()){
            char ch = s.charAt(pointerB);
            if(!map.contains(ch)){
                map.add(ch);
                pointerB++;
                max = Math.max(max,map.size());
                
            } else{
                map.remove(s.charAt(pointerA));
                pointerA++;
            }
        }
        
        return max;
        
    }
}