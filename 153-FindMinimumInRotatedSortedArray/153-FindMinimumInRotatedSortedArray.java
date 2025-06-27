// Last updated: 6/27/2025, 11:43:51 AM
class Solution {
    public int findMin(int[] a) {
        int left = 0, right = a.length-1;
        while(left < right){
            int mid = left + (right-left)/2;
            if(a[mid] > a[right]) left = mid + 1;
            else right = mid;
        }
        return a[left];
    }
}