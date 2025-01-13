# Title: How Many Numbers Are Smaller Than the Current Number
# Submission ID: 1507517043
# Status: Accepted
# Date: January 13, 2025 at 11:14:58 PM GMT+5:30

class Solution {

    public int[] smallerNumbersThanCurrent(int[] nums) {
        int num [] = new int [nums.length];

        for(int i=0 ;i<nums.length;i++){
            int sum =0 ;
            for(int j=0;j<nums.length ;j++){
                if (nums[i]>nums[j]) sum++;
            }
            num[i]=sum;
        }
        return num;
    }
}