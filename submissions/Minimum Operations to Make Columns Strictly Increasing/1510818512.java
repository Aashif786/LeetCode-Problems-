# Title: Minimum Operations to Make Columns Strictly Increasing
# Submission ID: 1510818512
# Status: Accepted
# Date: January 17, 2025 at 01:00:47 AM GMT+5:30

class Solution {
    public int minimumOperations(int[][] grid) {
        int x=0;
        for(int j=0;j<grid[0].length;j++)
        {
            for(int i=1;i<grid.length;i++)
            {
                if(grid[i][j]<=grid[i-1][j]){
                    int dif= grid[i-1][j]-grid[i][j]+1;
                    grid[i][j]+=dif;
                    x+=dif;
                }
            }
        }
        return x;
    }
}