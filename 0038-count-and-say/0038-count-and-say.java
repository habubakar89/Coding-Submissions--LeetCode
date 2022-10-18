class Solution {
    public String countAndSay(int n) {
        if(n <= 0) return "";
        String ans = "1";
        
        while(n > 1){
            StringBuilder temp = new StringBuilder();
            for(int i = 0 ; i < ans.length() ; i++){
                int count = 1;
                
                while(i + 1 < ans.length() && ans.charAt(i) == ans.charAt(i + 1)){
                    i++;
                    count++;
                }
                temp.append(count).append(ans.charAt(i));
            }
            n--;
            ans = temp.toString();
        }
        return ans;
    }
}