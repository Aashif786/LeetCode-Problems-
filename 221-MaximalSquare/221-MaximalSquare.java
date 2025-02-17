class Solution {
    public int maximalSquare(char[][] matrix) {
        if(matrix.length == 0 || matrix[0].length == 0) return 0;
        int m = matrix.length;
        int n = matrix[0].length;
        int a[][] = new int[m+1][n+1];
        int max = 0 ;
        for(int i = 1; i <= m; i++){
            for(int j = 1; j <= n; j++){
                if (matrix[i - 1][j - 1] == '1')
                {
                    a[i][j] = 1 + Math.min(Math.min(a[i-1][j], a[i][j-1]), a[i-1][j-1]);
                    max = Math.max(max , a[i][j]);
                }
            }
        }
        return max*max ;
    }
}