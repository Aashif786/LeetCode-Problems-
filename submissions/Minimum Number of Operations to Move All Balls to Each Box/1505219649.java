# Title: Minimum Number of Operations to Move All Balls to Each Box
# Submission ID: 1505219649
# Status: Accepted
# Date: January 11, 2025 at 09:34:02 PM GMT+5:30

class Solution {
    public int[] minOperations(String boxes) {
        int  n = boxes.length();
        int res[]= new int[n];
        for(int i=0; i<n;i++){
            int sum=0;
            if(boxes.charAt(i)=='1')    
            {
                for(int j=0; j<n;j++){
                    res[j]+=Math.abs(j-i);
                }
            }
        }
        return res;
    }
}