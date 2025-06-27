// Last updated: 6/27/2025, 11:41:06 AM
class Solution {
    public int pivotInteger(int n) {
        int  res = -1;
        int sum = n*(n+1)/2;
        for(int i = 1; i <= n; i++){
            int tsum = i*(i+1)/2;
            if (tsum == sum-tsum+i) res = i;
        }
        return res;
    }
}