// Last updated: 6/27/2025, 11:43:50 AM
class Solution {
    public int findMin(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        while(left < right)
        {
            int mid = left + (right - left) / 2;
            if(nums[mid] >nums[right])
            {
                left = mid + 1;
            }
            else if(nums[mid] == nums[right]) {right--;}
            else{
                right = mid;
            }
        }
        return nums[left];
    }
}