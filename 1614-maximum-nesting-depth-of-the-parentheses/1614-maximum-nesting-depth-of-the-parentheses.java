class Solution {
    public int maxDepth(String s) {
        int maxDepth = 0 , count = 0;
        
        for(char ch : s.toCharArray()){
            if(ch == '(') maxDepth = Math.max(maxDepth , ++count);
            else if(ch == ')') count--;
        }
        return maxDepth;
    }
}