class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        
        for(char ch : s.toCharArray()){
            
            if(ch =='(' || ch =='[' || ch =='{') stack.push(ch);
            if(stack.isEmpty()) return false;
            if(ch == ')'){
                if(stack.pop() != '(') return false;
            }
            else if(ch == ']'){
                if(stack.pop() != '[') return false;
            }
            else if(ch == '}'){
                if(stack.pop() != '{') return false;
            } 
        }
        
        return !stack.isEmpty() ? false : true;
    }
}