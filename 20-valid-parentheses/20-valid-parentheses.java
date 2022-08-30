class Solution {
    public boolean isValid(String s) {
        
        //Intro DS
        Stack<Character> stack = new Stack<>();
        
        //Loop over the given string
        for(int i = 0 ; i < s.length() ; i++){
            
            //Add opening brackets to the stack
            if(s.charAt(i) == '[' || s.charAt(i) == '(' || s.charAt(i) == '{') stack.push(s.charAt(i));
            
            if(stack.isEmpty()) return false;
            
            if(s.charAt(i) == ']'){
                if(stack.pop() != '[') return false;
            }
            
            if(s.charAt(i) == '}'){
                if(stack.pop() != '{') return false;
            }
            
            if(s.charAt(i) == ')'){
                if(stack.pop() != '(') return false;
            }
            
        }
        
        if(stack.isEmpty() != true) return false;
        return true;
    }
}