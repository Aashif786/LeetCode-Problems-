// Last updated: 6/27/2025, 11:44:56 AM
import java.util.Arrays;
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int k=0;
        int m = nums1.length;
        int n = nums2.length;
        int [] a = new int[m+n];
        int an= a.length;

        for(int i=0;i<m;i++){
            a[k++]=nums1[i];
        }
        for(int i=0;i<n;i++){
            a[k++]=nums2[i];
        }Arrays.sort(a);
        for(int i : a)System.out.print(i+" ");
        if(an%2==1)return a[a.length/2];
        else return ((double)a[an/2]+(double)a[an/2-1])/2.0;
    }
}