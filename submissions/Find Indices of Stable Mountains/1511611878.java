# Title: Find Indices of Stable Mountains
# Submission ID: 1511611878
# Status: Accepted
# Date: January 17, 2025 at 08:57:37 PM GMT+5:30

class Solution {
    public List<Integer> stableMountains(int[] h, int t) {
        List<Integer> ans = new ArrayList<>();
        for(int i=1;i<h.length;i++)
            if(h[i-1]>t) ans.add(i);
        return ans;
    }
}