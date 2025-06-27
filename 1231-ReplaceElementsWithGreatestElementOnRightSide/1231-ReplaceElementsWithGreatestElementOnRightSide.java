// Last updated: 6/27/2025, 11:42:11 AM
class Solution {
    public int[] replaceElements(int[] arr) {
        int n = arr.length  ;
        
        int max = -1;
        for(int j =  n-1 ; j>=0 ; j--)
        {
            int k = arr[j];
            arr[j] =  max;
            max =Math.max(max , k); 
        }
        return arr;
    }
}