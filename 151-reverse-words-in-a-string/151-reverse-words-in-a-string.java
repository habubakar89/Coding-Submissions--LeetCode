class Solution {
    public String reverseWords(String s) {
        
        //Split the string based on whitespaces and add it to a string array
        String[] temp = s.split("\\s+");
        String ans = "";
        
        //Iterate and add the words from the end
        for(int i = temp.length-1 ; i >= 0 ; i--) ans += temp[i] + " ";
        
        //Trim for any leading or trailing whitespces
        ans = ans.trim();
        
        return ans;
    }
}