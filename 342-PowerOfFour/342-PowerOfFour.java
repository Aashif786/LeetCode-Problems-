// Last updated: 6/27/2025, 11:43:08 AM
class Solution {
    public boolean isPowerOfFour(int n) {
        if (n==0) return false;
        if (n==1) return true;
        while(n>0 && n%4==0){
            n/=4;
            if (n==1) return true;
        }
        return false;
    }
}