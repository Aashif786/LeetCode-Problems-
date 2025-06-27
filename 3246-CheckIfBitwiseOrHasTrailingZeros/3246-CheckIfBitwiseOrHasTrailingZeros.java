// Last updated: 6/27/2025, 11:40:39 AM
class Solution {
    public boolean hasTrailingZeros(int[] nums) {
        int x = 0;
        for(int i : nums){
            if(i % 2 == 0) x++;
            if(x==2) return true;
        }
        return false ;
    }
}