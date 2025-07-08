// Last updated: 7/8/2025, 10:01:05 PM
public class Solution {
    public int islandPerimeter(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int c = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == 1) {
                    if ((j > 0 && grid[i][j - 1] == 0) || j == 0) c++;
                    if ((i > 0 && grid[i - 1][j] == 0) || i == 0) c++;
                    if ((j < m - 1 && grid[i][j + 1] == 0) || j == m - 1) c++;
                    if ((i < n - 1 && grid[i + 1][j] == 0) || i == n - 1) c++;
                }
            }
        } return c;
    }
}