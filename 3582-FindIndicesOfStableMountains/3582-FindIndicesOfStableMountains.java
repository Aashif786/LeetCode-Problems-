// Last updated: 6/27/2025, 11:40:20 AM
class Solution {
    public List<Integer> stableMountains(int[] h, int t) {
        List<Integer> ans = new ArrayList<>();
        for(int i=1;i<h.length;i++)
            if(h[i-1]>t) ans.add(i);
        return ans;
    }
}