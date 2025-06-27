// Last updated: 6/27/2025, 11:41:42 AM
class Solution {
    public int maxDepth(String s) {
        int n =0,x=0;
        for(char c : s.toCharArray()){
            if(c == '(') {
                n++;
                if(n > x) x = n;
            }
            else if (c == ')') n--;
        }
        return x;
    }
}