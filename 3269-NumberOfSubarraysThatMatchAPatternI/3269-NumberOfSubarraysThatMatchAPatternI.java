// Last updated: 8/1/2025, 1:55:41 PM
class Solution {
    public int countMatchingSubarrays(int[] nums, int[] pattern) {
        int res = 0, x = pattern.length, y = nums.length;
        for(int i = 0; i <= y - x + 1; i++)
        for(int j = i; j < y; j++)
            if(j - i + 1 == x + 1){
                int l = i;int flag = 0;
                for(int k = 0; k < x; k++){
                    if(pattern[k] == 1 && nums[l + 1] > nums[l]) {l++; continue;}
                    else if(pattern[k] == 0 && nums[l + 1] == nums[l]) {l++; continue;}
                    else if(pattern[k] == -1 && nums[l + 1] < nums[l]) {l++; continue;}
                    else {flag = 1; break;}
                }
                if(flag == 0) res++;
            }
            
        
        return res;
    }
}