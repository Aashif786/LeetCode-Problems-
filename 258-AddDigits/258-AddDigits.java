// Last updated: 6/27/2025, 11:43:22 AM
class Solution {
    public int addDigits(int num) {
        if (num == 0) return 0;
        return (num % 9 == 0) ? 9 : (num % 9);
    }
}
