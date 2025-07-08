// Last updated: 7/8/2025, 10:00:58 PM
class Solution {
    public int findCircleNum(int[][] isConnected) {
        int n = isConnected.length;
        boolean [] vs = new boolean[n];
        int c = 0;
        for(int i = 0; i < n; i++){
            if(!vs[i]){
                dfs(isConnected, vs, i);
                c++;
            }
        }
        return c;
    }
    static void dfs(int[][] isConnected, boolean[] vs, int i){
        vs[i] = true;
        for(int j = 0; j < isConnected.length; j++){
            if(isConnected[i][j] == 1 && !vs[j]) dfs(isConnected, vs, j);
        }
    }
}