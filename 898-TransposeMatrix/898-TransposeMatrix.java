// Last updated: 6/27/2025, 11:42:29 AM
class Solution {
    public int[][] transpose(int[][] mat) {
    
        int m = mat.length;
        int n = mat[0].length;
        int arr[][] = new int[n][m];
        for(int i=0;i<m;i++){
            for(int j = 0;j<n;j++)
                arr[j][i]=mat[i][j];
        }
        return arr;
    }
}