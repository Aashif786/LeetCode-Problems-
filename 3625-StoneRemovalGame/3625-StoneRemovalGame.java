// Last updated: 6/27/2025, 11:40:22 AM
class Solution {
    public boolean canAliceWin(int n) {
        int[] stones = {19,15,11,7,3};
        for (int stone : stones) {
            if (n>=stone) {
                n-=stone;
            } 
            else return n >= (stone / 2) + 1;
        }
        return true;
    }
}