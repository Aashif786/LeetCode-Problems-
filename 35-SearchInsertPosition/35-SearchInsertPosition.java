// Last updated: 6/27/2025, 11:44:38 AM
class Solution 
{
    public int searchInsert(int[] nums, int target) 
    {
        int low = 0 ;
        int high = nums.length - 1 ;
        while(low <= high){
            int mid = low + (high - low)/2;
            if(target == nums[mid]) return mid;
            if(target > nums[mid]) low = mid + 1;
            else if(target < nums[mid]) high = mid - 1;
        }
        return low;
    }
}


/*
class Solution 
{
    public int searchInsert(int[] nums, int target) 
    {
        if (target>nums[nums.length-1])
            return nums.length;
        
        for (int i=0;i<nums.length;i++)
        {
            if (nums[i]==target)
                return i;
            
            if(nums[i]<target && target<nums[i+1])
                return i+1;
        }
        return 0;
    }
}*/