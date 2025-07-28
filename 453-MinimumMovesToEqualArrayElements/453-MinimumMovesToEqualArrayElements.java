// Last updated: 7/28/2025, 3:27:41 PM
class Solution {  
    public int minMoves(int[] nums) {
        int min = nums[0], res = 0;
        for(int i : nums) min = Math.min(min, i);
        for(int i : nums) res += (i - min);
        return res;
    }
}