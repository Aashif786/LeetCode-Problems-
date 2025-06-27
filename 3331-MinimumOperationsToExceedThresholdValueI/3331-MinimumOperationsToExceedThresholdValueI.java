// Last updated: 6/27/2025, 11:40:38 AM
class Solution {
    public int minOperations(int[] nums, int k) {
        int x=0;
        for(int i : nums) {
            if (i<k) x++;
        }
        return x;
    }
}