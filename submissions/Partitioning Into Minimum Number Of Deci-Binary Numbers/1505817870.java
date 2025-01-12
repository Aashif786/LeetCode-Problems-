# Title: Partitioning Into Minimum Number Of Deci-Binary Numbers
# Submission ID: 1505817870
# Status: Accepted
# Date: January 12, 2025 at 10:46:59 AM GMT+5:30

class Solution {
    public int minPartitions(String n) {
        return n.chars().max().getAsInt() - '0';
    }
}