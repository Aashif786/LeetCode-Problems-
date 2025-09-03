// Last updated: 9/3/2025, 10:00:50 AM
class Solution {
    public boolean checkTwoChessboards(String c1, String c2) {
        return Math.abs(c1.charAt(0) - c2.charAt(0)) % 2 == Math.abs(c1.charAt(1) - c2.charAt(1)) % 2;
    }
}