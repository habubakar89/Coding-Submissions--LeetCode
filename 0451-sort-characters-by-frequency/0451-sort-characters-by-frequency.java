class Solution {
    public String frequencySort(String s) {
        Map<Character , Integer> map = new HashMap<>();
        for(char ch : s.toCharArray()) map.put(ch , map.getOrDefault(ch , 0) + 1);
        String string = "";
        
        List<Character>[] bucket = new List[s.length() + 1]; 
        
        for(char ch : map.keySet()){
            int frequency = map.get(ch);
            if(bucket[frequency] == null) bucket[frequency] = new ArrayList<>();
            bucket[frequency].add(ch);
        }
        
        StringBuilder sb = new StringBuilder();
        for(int i = bucket.length - 1 ; i >= 0 ; i--){
            if(bucket[i] != null){
                Collections.sort(bucket[i]);
                for(char ch : bucket[i]){
                    for(int it = 0 ; it < i ; it++) sb.append(ch);
                }
            }
        }
        
        
        return sb.toString();
        
    }
}