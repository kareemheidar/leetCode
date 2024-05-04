class MinStack {
    private Stack<Integer> stack;
    private Stack<Integer> minim;

    public MinStack() {
        stack = new Stack<>();
        minim = new Stack<>();
    }
    
    public void push(int val) {
        if(minim.isEmpty() || val<=minim.peek())
            minim.push(val);
        stack.push(val);

    }
    
    public void pop() {
        int x = stack.pop();
        if(minim.peek() == x)
            minim.pop();
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        return minim.peek();
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