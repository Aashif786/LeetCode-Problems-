// Last updated: 6/27/2025, 11:44:51 AM
class Solution {
    public int maxArea(int[] height) {
        int start=0,end=height.length-1,maxarea=0;
        while (start<end){
            int vol = (end-start)*Math.min(height[end],height[start]);
            if(vol>maxarea) maxarea = vol;
            if(height[start]<height[end]) start++;
            else end--;
        }
        System.gc();
        return maxarea;
    }
}