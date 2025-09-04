// Last updated: 9/4/2025, 12:43:04 PM
class Solution {
    public int findClosest(int x, int y, int z) {
        int i  = Math.abs(z-x); 
        int ii = Math.abs(z-y);
        if(i == ii) return 0;
        return i < ii ? 1 : 2;  
    }
}