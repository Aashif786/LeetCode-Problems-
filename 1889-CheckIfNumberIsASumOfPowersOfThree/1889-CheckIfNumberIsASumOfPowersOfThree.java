// Last updated: 6/27/2025, 11:41:34 AM
class Solution {
    public boolean checkPowersOfThree(int n) {
        while(n>0){
            int r = n % 3;
            if(r == 2) return  false;
            n /= 3;
        }
        return true;
    }
}