// Last updated: 6/27/2025, 11:41:55 AM
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
class Solution {
    public List<Integer> minSubsequence(int[] nums) {
        List<Integer> res = new ArrayList<Integer>();
        Arrays.sort(nums);
        int sum1=0;
        for(int i=nums.length-1;i>=0;i--){
            sum1+=nums[i];
            res.add(nums[i]);
            int sum2=0;
            for(int j=i-1;j>=0;j--){
                sum2+=nums[j];
            }
            if(sum1>sum2) return res;
        }
        return res;
    }
}