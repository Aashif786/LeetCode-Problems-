// Last updated: 6/27/2025, 11:40:24 AM
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