// Last updated: 6/27/2025, 11:43:11 AM
class Solution {
    public boolean isPowerOfThree(int n) {
        if(n<=0) return false;
        while(n%3==0) n/=3;
        return n==1;
    }
}