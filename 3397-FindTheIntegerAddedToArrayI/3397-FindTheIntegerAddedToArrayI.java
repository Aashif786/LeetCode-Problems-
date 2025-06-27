// Last updated: 6/27/2025, 11:40:32 AM
class Solution {
    public int addedInteger(int[] nums1, int[] nums2) {
        int m1= Integer.MAX_VALUE;
        int m2= Integer.MAX_VALUE;
        for(int i= 0; i< nums1.length; i++){
            if(nums2[i] < m2) m2 = nums2[i];
            if(nums1[i] < m1) m1 = nums1[i];
        }

        return m2-m1;
    }
}