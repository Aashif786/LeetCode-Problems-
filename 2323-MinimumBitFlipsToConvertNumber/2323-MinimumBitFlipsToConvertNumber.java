// Last updated: 6/27/2025, 11:41:16 AM
class Solution {
    public int minBitFlips(int a, int b) {
        return Integer.bitCount(a^b);
    }
}