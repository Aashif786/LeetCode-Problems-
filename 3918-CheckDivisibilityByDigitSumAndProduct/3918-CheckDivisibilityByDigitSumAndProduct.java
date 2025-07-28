// Last updated: 7/28/2025, 3:24:33 PM
class Solution {
    public boolean checkDivisibility(int n) {
        int p = 1, s = 0, x = n;
        while(x > 0) {
            int r = x % 10;
            s += r;
            p *= r;
            x /= 10;
        }
        return n % (p + s) == 0;
    }
}