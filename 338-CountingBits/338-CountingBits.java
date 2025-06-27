// Last updated: 6/27/2025, 11:43:10 AM
class Solution {
    public int[] countBits(int n) {
        int ans [] = new int[n+1];
        for(int i = 0; i <= n; i++){
            ans[i] = bitcount(i);
        }  
        return ans;
    }


    static int bitcount(int n){
        int bits = 0;
        while(n > 0){
            if(n%2 == 1) bits ++;
            n /= 2 ;

        }
        return bits;
    }
}

