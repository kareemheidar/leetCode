class Solution {
    public boolean isValid(String s) {
        if(s.length() % 2 == 1){
            return false;
        }
        Stack<Character> stack = new Stack<>();
        int i = 0;
        while (i < s.length()){
            if (stack.isEmpty())
                stack.push(s.charAt(i));
            else if(stack.peek() == '(' && s.charAt(i) == ')')
                stack.pop();
            else if (stack.peek() == '{' && s.charAt(i) == '}')
                stack.pop();
            else if (stack.peek() == '[' && s.charAt(i) == ']') 
                stack.pop();
            else 
                stack.push(s.charAt(i));
            i++;
        }
        return (stack.isEmpty());
    }
}