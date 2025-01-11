# Title: Concatenation of Array
# Submission ID: 1505166975
# Status: Accepted
# Date: January 11, 2025 at 08:33:26 PM GMT+5:30

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