// Last updated: 6/27/2025, 11:40:23 AM
class Solution {
    public boolean isBalanced(String num) {
        int ev = 0;
        int odd = 0;
        int n =num.length()-1;
        for(int i=0 ; i<=n; i+=2)
        {
            ev += num.charAt(i)-'0';
            if(i != n) odd+= num.charAt(i+1)-'0';      
        }
        return ev == odd;
    }
}