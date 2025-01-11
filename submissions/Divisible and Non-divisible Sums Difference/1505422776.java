# Title: Divisible and Non-divisible Sums Difference
# Submission ID: 1505422776
# Status: Accepted
# Date: January 12, 2025 at 01:04:53 AM GMT+5:30

class Solution {
    public int differenceOfSums(int n, int m) {
        int x=0;int y=0;
        for(int i=1;i<=n;i++){
            if(i%m==0) x+=i;
            else y+=i;
        }
        return y-x;
    }
}