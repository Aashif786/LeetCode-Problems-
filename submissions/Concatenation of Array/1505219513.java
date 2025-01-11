# Title: Concatenation of Array
# Submission ID: 1505219513
# Status: Accepted
# Date: January 11, 2025 at 09:33:53 PM GMT+5:30

class Solution {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int num[]= new int [2*n];
        for(int i=0;i<num.length;i++){
            num[i]=nums[i%n];
        }
        return num;
    }
}