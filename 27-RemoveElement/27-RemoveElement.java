// Last updated: 6/27/2025, 11:44:42 AM
class Solution {
    public int removeElement(int[] nums, int val) {
        int k=0;
        for (int i =0;i<nums.length;i++){
            if (nums[i]!=val){
                nums[k]=nums[i];k++;
            }
        }
        return k;
    }
}