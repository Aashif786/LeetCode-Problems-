// Last updated: 7/8/2025, 10:00:46 PM
class Solution {
    public int[][] floodFill(int[][] img, int sr, int sc, int color) {
        flood(img, sr, sc, color, img[sr][sc]);
        return img;
    }
    static void flood(int[][] img, int sr, int sc, int color, int cr){
        if(sr<0 || sr >= img.length || sc<0 || sc >= img[0].length || cr == color) return ;
        if(cr != img[sr][sc]) return;
        img[sr][sc] = color;
        flood(img, sr + 1, sc, color, cr);
        flood(img, sr - 1, sc, color, cr);
        flood(img, sr, sc + 1, color, cr);
        flood(img, sr, sc - 1, color, cr);
    }
}