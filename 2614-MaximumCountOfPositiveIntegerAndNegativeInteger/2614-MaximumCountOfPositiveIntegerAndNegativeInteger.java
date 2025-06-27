// Last updated: 6/27/2025, 11:41:05 AM
class Solution {
    public int maximumCount(int[] nums) {
        int x = 0 ,y = 0;
        for(int i : nums){
            if(i > 0) x++;
            else if (i < 0) y++;
        }
        return (x > y)? x : y ;
    }
}