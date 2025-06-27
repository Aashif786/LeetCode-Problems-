// Last updated: 6/27/2025, 11:41:00 AM
class Solution {
    public int minLength(String s) 
    {
        Stack <Character> st = new Stack<>();
        for(char ch : s.toCharArray()){
            if(!st.isEmpty() && ((ch=='B' && st.peek()=='A')||(ch=='D' && st.peek()=='C') )) st.pop();
            else st.push(ch);
        }
        return st.size();
    }
}