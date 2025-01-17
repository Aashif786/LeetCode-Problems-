class Solution {
    public int maxProfit(int[] p) {
        if (p.length < 2) return 0;
        int max=0;
        int min=Integer.MAX_VALUE;
        for(int pr: p){
            if (pr<min) min = pr;
            else if (pr-min > max) max=pr-min;
        }
        return max;
    }
}