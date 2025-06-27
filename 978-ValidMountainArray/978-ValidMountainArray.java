// Last updated: 6/27/2025, 11:42:24 AM
class Solution {
    public boolean validMountainArray(int[] a) {
        if(a.length<3) return false;
        int n = a.length;
        int i = 0; 
        int j = n-1;
        while(i < j){
            if(a[i+1] > a[i] ) i++;
            else if(a[j-1] > a[j]) j--;
            else break;
        }
        return i != 0 && j != n-1 && i == j;
    }
}