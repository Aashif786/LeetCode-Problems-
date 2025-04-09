// Last updated: 4/9/2025, 1:45:28 PM
class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        return numBottles + shop(numBottles, numExchange);
    }

    static int shop(int b, int req){
        if(b < req)  return 0;
        return b/req + shop(b/req + b%req, req);
    }
}