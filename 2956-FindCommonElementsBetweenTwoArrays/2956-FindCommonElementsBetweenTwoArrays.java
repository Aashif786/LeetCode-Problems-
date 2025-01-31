import java.util.*;
class Solution {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
        Set <Integer> a = new HashSet<>();
        for(int i : nums1) a.add(i);
        Set <Integer> b = new HashSet<>();
        for(int i : nums2) b.add(i);
        a.retainAll(b);
        int i=0,j=0;
        for(int s :a){
            for(int x:nums1){
                if(x==s) i++;
            }            
            for(int x:nums2){
                if(x==s) j++;
            }
        }
        return new int [] {i,j};
    }
}