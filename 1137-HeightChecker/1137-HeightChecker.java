// Last updated: 9/3/2025, 10:02:21 AM
class Solution {
    public int heightChecker(int[] heights) {
        int[] arr = heights.clone();
        Arrays.sort(arr);
        int x = 0;
        for(int i = 0; i < arr.length; i++)
            if(arr[i] != heights[i]) x++;
        return x;
    }
}