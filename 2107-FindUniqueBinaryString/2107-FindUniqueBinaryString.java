// Last updated: 6/27/2025, 11:41:26 AM
class Solution {
    public String findDifferentBinaryString(String[] nums) {
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<nums.length;i++) sb.append(nums[i].charAt(i) == '0'? "1": "0");
        return new String(sb);
    }
}