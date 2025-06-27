// Last updated: 6/27/2025, 11:41:51 AM
class Solution {
    public int[] shuffle(int[] nums, int n) {
        int nn[]= new int[n*2];
        for(int i=0 ; i<n ;i++){
            
            nn[2*i]=nums[i];
            nn[2*i+1]=nums[n+i];
        }
        return nn;
    }
}