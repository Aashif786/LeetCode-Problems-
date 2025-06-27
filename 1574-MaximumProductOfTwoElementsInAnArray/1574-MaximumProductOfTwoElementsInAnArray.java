// Last updated: 6/27/2025, 11:41:53 AM
class Solution {
    public int maxProduct(int[] nums) {
        int m1 = Integer.MIN_VALUE;
        int m2 = Integer.MIN_VALUE;
        for(int i : nums){
            if(m1 < i){
                m2 = m1;
                m1 = i;
            }else if(m1 >= i && m2 < i){
                m2 = i;
            }
        }
        return (m1-1)*(m2-1);
    }
}