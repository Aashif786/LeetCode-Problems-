// Last updated: 6/27/2025, 11:42:58 AM
class Solution {
    public int hammingDistance(int x, int y) {
        return Integer.bitCount(x^y);
    }
}