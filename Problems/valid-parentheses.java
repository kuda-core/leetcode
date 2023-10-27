class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();
        for(int i = 0; i < s.length(); i++) {
            char curr = s.charAt(i);
            if(stack.empty()) {
                stack.push(curr);
                continue;
            }
            char prev = stack.peek();
            if(compare(prev, curr) == false) {
                stack.push(curr);
            } else {
                stack.pop();
            }
        }

        if(stack.empty())
            return true;
        return false;
    }
    public boolean compare(char x, char y) {
        if (x == '(' && y == ')')
            return true;
        else if (x == '[' && y == ']')
            return true;
        else if (x == '{' && y == '}')
            return true;
        else
            return false;
    }
}
