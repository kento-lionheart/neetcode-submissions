class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        Set<Character> closed = Set.of('}', ']', ')');
        Set<Character> open = Set.of('(', '[', '{');
        for (int i = 0; i < s.length(); i++) {
            char temp =s.charAt(i);
            if(stack.isEmpty() && closed.contains(temp)){
                return false;
            }
            if(open.contains(temp)){
                stack.push(temp);
            }
            else{
                char c = stack.peek();
                if(c == '(' && temp == ')' || c == '{' && temp == '}' || c == '[' && temp == ']'){
                    stack.pop();
                }
                else return false;
            }
        }
        return stack.isEmpty();
    }
}
