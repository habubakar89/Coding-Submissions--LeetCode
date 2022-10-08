class Solution {
    public boolean isIsomorphic(String s, String t) {
       if(s.length() != t.length()) return false;
        HashMap<Character,Character> map = new HashMap<>();
        for(int i = 0 ; i < s.length() ; i++){
            char sh = s.charAt(i);
            char th = t.charAt(i);
            if(map.containsKey(sh)){
                if(th != map.get(sh)) return false;
            }
            else map.put(sh,th);
        }
        HashSet<Character> set = new HashSet<>(map.values());
        return set.size() == map.values().size() ? true : false;
    }
}