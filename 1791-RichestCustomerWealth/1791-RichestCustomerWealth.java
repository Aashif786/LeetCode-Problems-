// Last updated: 6/27/2025, 11:41:38 AM
class Solution {
    public int maximumWealth(int[][] accounts) {
        int max=0;
        for(int i=0;i<accounts.length;i++){
            int sum=0;
            for(int j=0;j<accounts[0].length;j++){
                sum+=accounts[i][j];
                if (sum>max) max = sum;
            }
        }
        return max;
    }
}