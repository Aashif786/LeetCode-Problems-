// Last updated: 6/27/2025, 11:40:45 AM
class Solution {
    public int sumIndicesWithKSetBits(List<Integer> nums, int k) {
        int sum = 0;
        for(int i = 0; i < nums.size(); i++){
            sum += (Integer.bitCount(i) == k)? nums.get(i) : 0;
        }
        return sum;
    }
    static int bitcount(int n){
        int x = 0;
        while(n > 0){
            if(n % 2 == 1) x++;            
            n = n >> 1;
        }
        return x;
    }
}