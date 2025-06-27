// Last updated: 6/27/2025, 11:43:19 AM
class Solution {
    public int missingNumber(int[] nums) {
        int sum=0;
        int n=nums.length;
        int tot= n*(n+1)/2;
        for (int i =0;i<n;i++){
            sum = sum+nums[i];
        }
        return tot - sum;
    }
}