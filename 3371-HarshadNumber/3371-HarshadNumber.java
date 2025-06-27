// Last updated: 6/27/2025, 11:40:35 AM
class Solution {
    public int sumOfTheDigitsOfHarshadNumber(int n) {
        int d = 0;
        int x = n;
        while(x > 0){
            int r = x%10;
            x /= 10;
            d += r;
        }
        return (n % d == 0)? d : -1;
    }
}