// Last updated: 6/27/2025, 11:42:22 AM
//BFS

class Solution {
    public int orangesRotting(int[][] grid) {
        if(grid == null || grid.length == 0) return -1;
        int fresh = 0;
        Queue<int[]> q = new LinkedList<>();
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[0].length; j++){
                if(grid[i][j] == 1) fresh++;
                else if(grid[i][j] == 2) q.offer(new int[] {i, j});
            }
        }
        if(fresh == 0) return 0;

        int mins = 0;

        int[][] dirs =  { {-1, 0}, {1, 0}, {0, -1}, {0, 1} };
        
        while(!q.isEmpty() && fresh > 0){
            int s = q.size();
            for(int i = 0; i < s; i++){
                int[] curr = q.poll();
                for(int[] dir : dirs){
                    int di = curr[0]+dir[0];
                    int dj = curr[1]+dir[1];
                    if(di >= 0 && di < grid.length && dj >= 0 && dj < grid[0].length && grid[di][dj] == 1) {
                        grid[di][dj] = 2;
                        q.add(new int[] {di, dj});
                        fresh--;
                    }
                }
            }
            mins++;
        }

        return (fresh == 0)? mins : -1;
    }
}