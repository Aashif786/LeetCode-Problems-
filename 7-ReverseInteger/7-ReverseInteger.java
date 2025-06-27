// Last updated: 6/27/2025, 11:44:55 AM
class Solution {
    public int reverse(int x) 
    {
        int rev=0;
        while(x!=0){
            int r=x%10;
            if (rev > Integer.MAX_VALUE / 10 || (rev == Integer.MAX_VALUE / 10 && r > 7)) {
                return 0;  // Positive overflow
            }
            if (rev < Integer.MIN_VALUE / 10 || (rev == Integer.MIN_VALUE / 10 && r < -8)) {
                return 0;  // Negative overflow
            }
            rev=rev*10 + r;
            x=x/10;
        }
        return rev;       
    }
}