// Last updated: 6/27/2025, 11:41:18 AM
class Solution {
    public int[] rearrangeArray(int[] nums) {
        int a[] = new int[nums.length];
        int x = 0, y = 1;
        for(int i : nums){
            if(i >= 0){
                a[x] = i;
                x += 2;
            }
            else{
                a[y] = i;
                y += 2;
            }
        }
        return a;
    }
    // public int[] rearrangeArray(int[] nums) {
    //     int a[] = new int[nums.length/2];
    //     int b[] = new int[nums.length/2];
    //     int x = 0, y = 0;
    //     for(int i = 0;  i < nums.length ; i++){
    //         if(nums[i] >= 0) a[x++] = nums[i];
    //         else b[y++] = nums[i];
    //     }
    //     x = 0; y = 0;
    //     for(int i = 0;  i < nums.length ; i++){
    //         if(i%2 == 0) nums[i] = a[x++];
    //         else nums[i] = b[y++];
    //     }
    //     return nums;
    // }
}
