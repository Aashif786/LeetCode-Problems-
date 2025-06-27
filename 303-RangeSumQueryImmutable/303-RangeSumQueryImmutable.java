// Last updated: 6/27/2025, 11:43:13 AM
class NumArray {
    int num[];
    public NumArray(int[] nums) {
        num = new int[nums.length];
        num[0] = nums[0];
        for(int i = 1; i < nums.length; i++) num[i] = num[i-1] + nums[i];
    }
    
    public int sumRange(int left, int right) {
        if(left == 0) return num[right];
        return num[right] - num[left-1];
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);

 eg:
 -2, 0, 3, -5, 2, -1
 -2,-2, 1, -4,-2, -3
 */