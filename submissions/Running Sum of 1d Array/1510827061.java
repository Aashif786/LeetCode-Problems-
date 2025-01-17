# Title: Running Sum of 1d Array
# Submission ID: 1510827061
# Status: Accepted
# Date: January 17, 2025 at 01:11:41 AM GMT+5:30

class Solution {
    public int[] runningSum(int[] nums) {
        for(int i=1;i<nums.length;i++) nums[i]+=nums[i-1];
        return nums;
    }
}