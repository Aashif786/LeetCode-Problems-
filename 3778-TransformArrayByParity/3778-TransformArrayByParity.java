// Last updated: 6/27/2025, 11:40:19 AM
class Solution {
    public int[] transformArray(int[] arr) {
        for(int i = 0 ; i < arr.length; i++) arr[i] = (arr[i]%2==0)? 0:1 ;
        Arrays.sort(arr);
        return arr;
    }
}