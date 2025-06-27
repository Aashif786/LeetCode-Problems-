// Last updated: 6/27/2025, 11:41:11 AM
class Solution {
    public int[] findArray(int[] pref) {
        for(int i=pref.length-1;i>0;--i){
             pref[i]^=pref[i-1];
        }
        return pref;
    }
}