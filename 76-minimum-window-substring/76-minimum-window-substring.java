class Solution {
    public String minWindow(String s, String t) {
        //Sliding Window Approach
        
        //Declare the DS
        int i = 0 , j = 0;
        int left = 0 , right = s.length() - 1;
        int minSubString = s.length();
        boolean found = false;
        HashMap<Character,Integer> map = new HashMap<Character,Integer>();
        
        //Add values of the small string into the hashmap
        for(char ch : t.toCharArray()) map.put(ch , map.getOrDefault(ch , 0) + 1);
        int count = map.size();
        
        //Traverse through the string
        while(j < s.length()){
            
            char ch = s.charAt(j++);
            if(map.containsKey(ch)){
                map.put(ch , map.get(ch) - 1);
                if(map.get(ch) == 0) count--;
            }
            
            //Skip the remaining loop if the given substring has not been found 
            if(count > 0) continue;
            
            while(count == 0){
                ch = s.charAt(i++);
                if(map.containsKey(ch)){
                    map.put(ch , map.get(ch) + 1);
                    if(map.get(ch) > 0) count++;
                }
            }
            
            if(j - i < minSubString){
                left = i;
                right = j;
                found = true;
                minSubString = j - i;
            }
            
        }
        
        return !found ? "" : s.substring(left - 1 , right);
        
        
    }
}