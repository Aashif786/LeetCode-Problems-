// Last updated: 6/27/2025, 11:41:36 AM
class Solution {
    public int minPartitions(String n) {
        return n.chars().max().getAsInt() - '0';
    }
}