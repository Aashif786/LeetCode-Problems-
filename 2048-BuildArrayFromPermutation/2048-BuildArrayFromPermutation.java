// Last updated: 6/27/2025, 11:41:29 AM
class Solution {
    public int[] buildArray(int[] nums) {
        int ans[]= new int[nums.length];
        for(int i=0;i<nums.length;i++){
            ans[i] = nums[nums[i]];
        }
        return ans;
    }
}