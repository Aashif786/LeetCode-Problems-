class Solution {
    public void rotate(int[] nums, int k) {
        k = k % nums.length;
        rev(nums, 0, nums.length - 1);
        rev(nums, 0, k - 1);
        rev(nums, k, nums.length - 1);
    }
    static void rev(int[]arr, int st, int end){
        while(st<end){
            int t = arr[st];
            arr[st] = arr[end];
            arr[end] = t;
            st++;
            end--;
        }
    }

}