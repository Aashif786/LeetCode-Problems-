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