// Last updated: 7/8/2025, 10:01:38 PM
class Solution {
    public int rob(int[] nums) {
        int s = nums.length;
        int dp[] = new int[s];
        if(nums.length == 1) return nums[0];
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0],nums[1]);
        for(int i = 2; i < s; i++){
            dp[i] = Math.max(nums[i] + dp[i-2], dp[i-1]);
        }
        return dp[s-1];
    }
}