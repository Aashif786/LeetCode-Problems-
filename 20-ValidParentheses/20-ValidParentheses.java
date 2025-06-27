// Last updated: 6/27/2025, 11:44:47 AM
class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack= new Stack<>();
        for (char c:s.toCharArray()){
            if(c=='{') stack.push('}');
            else if(c=='(') stack.push(')');
            else if(c=='[') stack.push(']');
            else if (stack.isEmpty()||stack.pop()!=c) return false;
        }
        return stack.isEmpty();
    }
}