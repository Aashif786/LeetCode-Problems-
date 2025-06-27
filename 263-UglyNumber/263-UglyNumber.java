// Last updated: 6/27/2025, 11:43:20 AM
class Solution {
    public boolean isUgly(int num) {
        for (int i=2; i<6 && num>0; i++)
            while (num % i == 0) num /= i;
        return num == 1;
    }
}