# Title: Shuffle the Array
# Submission ID: 1505803505
# Status: Accepted
# Date: January 12, 2025 at 10:28:16 AM GMT+5:30

class Solution {
    public int[] shuffle(int[] nums, int n) {
        int nn[]= new int[n*2];
        for(int i=0 ; i<n ;i++){
            
            nn[2*i]=nums[i];
            nn[2*i+1]=nums[n+i];
        }
        return nn;
    }
}