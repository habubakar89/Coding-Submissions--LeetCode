class Solution {
    public int countSubstrings(String s) {
        //Two pointer Approach
        
        //Declare the DS
        int result = 0;
        int left = 0 , right = 0;
        
        //Loop through the array
        for(int i = 0 ; i < s.length() ; i++){
            left = i;
            right = i;
            
            //Expand for odd number
            while(left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)){
                result++;
                left--;
                right++;
            }
            
            //Expand for even number
            left = i;
            right = i + 1;
            while(left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)){
                result++;
                left--;
                right++;
            }
            
        }
        
        return result;
    }
}