// Last updated: 6/27/2025, 11:43:59 AM
class Solution {
    public int longestConsecutive(int[] a) {
        if(a.length == 0 || a == null) return 0;
        int len = 1;
        int count = 1;
        int n = a.length;
        Arrays.sort(a);
        for(int i = 0; i < n-1; i++){
            if(a[i] == a[i+1]) {
                continue;
            }
            else if(a[i] == a[i+1]-1){
                count++;
            }
            else {
                len = Math.max(len, count);
                count = 1;
            }
        }
        len = Math.max(len, count);
        return len;
    }
}