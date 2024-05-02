class Solution {
    public boolean isValid(String s) {
        if(s.length() % 2 == 1) return false;
        Stack<String> stack = new Stack<>();
        for(String symbol : s.split(""))
            if(symbol.equals("(") || symbol.equals("[") || symbol.equals("{"))
                stack.push(symbol);
            else {
                switch (symbol) {
                    case ")":
                        if(stack.isEmpty() || !stack.pop().equals("("))
                            return false;
                        break;
                    case "]":
                        if(stack.isEmpty() || !stack.pop().equals("["))
                            return false;
                        break;
                    case "}":
                        if(stack.isEmpty() || !stack.pop().equals("{"))
                            return false;
                        break;
                }
            }
        return stack.isEmpty();

    }
}