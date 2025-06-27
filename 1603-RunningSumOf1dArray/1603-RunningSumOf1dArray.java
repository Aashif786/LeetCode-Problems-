// Last updated: 6/27/2025, 11:41:48 AM
class Solution {
    public int[] runningSum(int[] nums) {
        for(int i=1;i<nums.length;i++) nums[i]+=nums[i-1];
        return nums;
    }
}