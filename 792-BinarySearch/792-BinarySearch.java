// Last updated: 6/27/2025, 11:42:37 AM
class Solution {
    public int search(int[] nums, int target) {
        int low = 0, high = nums.length-1;
        return binary(low, high, target, nums);
    }
    static int binary(int low, int high, int target, int [] nums){
        if(low > high) return -1;
        int mid = (high + low)/2;
        if(nums[mid] == target) return mid;
        if(target < nums[mid]) return binary(low, mid-1, target, nums);
        else return binary(mid+1 , high, target, nums);
    }
}