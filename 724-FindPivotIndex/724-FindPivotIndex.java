// Last updated: 6/27/2025, 11:42:46 AM
class Solution {
    public int pivotIndex(int[] nums) {
        int  p = -1;
        int l = nums.length;
        int [] a = new int[l];
        a[0] = nums[0];
        for(int i = 1; i < l; i++) a[i] = a[i-1] + nums[i];
        int left = 0;
        for(int i = 0; i < l; i++) {
            if(i != 0) left = a[i-1];
            int right = a[l-1] - a[i];
            if(right == left) { p = i; break; }
        }
        return p;
    }
}


/*
1 2 3 4  5
1 3 6 10 15
*/