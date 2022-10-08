class Pair{
    int element;
    int min;
    public Pair(int element , int min){
        this.element = element;
        this.min = min;
    }
}
class MinStack {
    Stack<Pair> stack;
    public MinStack() {
        stack = new Stack<>();
    }
    
    public void push(int val) {
        int min;
        if(stack.isEmpty()){
            min = val;
        }else{
            min = Math.min(stack.peek().min , val);
        }
        stack.push(new Pair(val , min));
    }
    
    public void pop() {
        stack.pop();
    }
    
    public int top() {
        return stack.peek().element;
    }
    
    public int getMin() {
        return stack.peek().min;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */