// Last updated: 6/27/2025, 11:43:16 AM
class Solution {
    public void moveZeroes(int[] arr) {
        int c = 0;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] != 0){
                int k = arr[i];
                arr[i] = arr[c];
                arr[c] = k;
                c++;
            }
        }
    }
}