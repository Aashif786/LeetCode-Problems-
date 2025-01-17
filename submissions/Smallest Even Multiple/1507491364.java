# Title: Smallest Even Multiple
# Submission ID: 1507491364
# Status: Accepted
# Date: January 13, 2025 at 10:52:39 PM GMT+5:30

class Solution {
    public int smallestEvenMultiple(int n) {
        if(n%2==0) return n;
        else return 2*n;
    }

}