// Last updated: 6/27/2025, 11:41:03 AM
class Solution {
    public int passThePillow(int n, int time) {
        int pass=time/(n-1);
        return pass%2==0 ? (time%(n-1)+1) : (n-time %(n-1)) ;
    }
}