// Last updated: 6/27/2025, 11:44:43 AM
class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length==0) return 0;
        
        int k=1;
        for (int i =1;i<nums.length;i++){
            if (nums[i]!=nums[k-1]){
                nums[k]=nums[i];
                k++;
            }
        }
        return k;
    }
}