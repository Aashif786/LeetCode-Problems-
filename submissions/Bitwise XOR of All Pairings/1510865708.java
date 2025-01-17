# Title: Bitwise XOR of All Pairings
# Submission ID: 1510865708
# Status: Time Limit Exceeded
# Date: January 17, 2025 at 02:08:54 AM GMT+5:30

class Solution {
    public int xorAllNums(int[] nums1, int[] nums2) {
        int x=0;
        int m=nums1.length;
        int n=nums2.length;
        for(int i=0;i<m;i++){
            for (int j=0;j<n;j++){
                int xor=nums1[i]^nums2[j];
                x^=xor;
            }
        }
        return x;
    }
}