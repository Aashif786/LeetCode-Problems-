# Title: Find Minimum Operations to Make All Elements Divisible by Three
# Submission ID: 1505417630
# Status: Accepted
# Date: January 12, 2025 at 12:58:22 AM GMT+5:30

class Solution {
    public int minimumOperations(int[] nums) {
        int x=0;
        for(int i =0;i<nums.length;i++){
            if(nums[i]%3==0) continue;
            x+=1;
        }
        return x;
    }
}