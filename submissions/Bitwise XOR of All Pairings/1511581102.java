# Title: Bitwise XOR of All Pairings
# Submission ID: 1511581102
# Status: Accepted
# Date: January 17, 2025 at 08:20:25 PM GMT+5:30

class Solution {
        public int xorAllNums(int[] A, int[] B) {
        int x = 0, y = 0;
        for (int a: A)
            x ^= a;
        for (int b: B)
            y ^= b;
        return (A.length % 2 * y) ^ (B.length % 2 * x);
    }
}