# Title: Jewels and Stones
# Submission ID: 1505808630
# Status: Accepted
# Date: January 12, 2025 at 10:35:01 AM GMT+5:30

class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int res =0;
        for (char ch1 : jewels.toCharArray()){
            for (char ch2 : stones.toCharArray()){
                if(ch1==ch2) res+=1;
            }
        }
        return res;
    }
}