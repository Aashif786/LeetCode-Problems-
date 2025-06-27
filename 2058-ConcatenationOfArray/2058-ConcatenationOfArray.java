// Last updated: 6/27/2025, 11:41:27 AM
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