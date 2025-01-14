# Title: Minimum Subsequence in Non-Increasing Order
# Submission ID: 1508235423
# Status: Accepted
# Date: January 14, 2025 at 04:19:55 PM GMT+5:30

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
class Solution {
    public List<Integer> minSubsequence(int[] nums) {
        List<Integer> res = new ArrayList<Integer>();
        Arrays.sort(nums);
        int sum1=0;
        for(int i=nums.length-1;i>=0;i--){
            sum1+=nums[i];
            res.add(nums[i]);
            int sum2=0;
            for(int j=i-1;j>=0;j--){
                sum2+=nums[j];
            }
            if(sum1>sum2) return res;
        }
        return res;
    }
}