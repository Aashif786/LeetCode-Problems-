// Last updated: 6/27/2025, 11:42:48 AM
class Solution {
    public boolean hasAlternatingBits(int n) {
        n = n ^ n >> 1;
        return (n & n + 1) == 0;
    }
}