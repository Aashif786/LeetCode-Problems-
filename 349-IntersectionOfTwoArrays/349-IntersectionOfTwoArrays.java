// Last updated: 6/27/2025, 11:43:04 AM

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {

    Set<Integer> A = new HashSet<>();
    for(int i: nums1){
        A.add(i);
    }

    Set<Integer> set = new HashSet<>();
    for(int i:nums2){
        if(A.contains(i)) set.add(i);
    }

    return set.stream().mapToInt(Integer::intValue).toArray();
    }
}