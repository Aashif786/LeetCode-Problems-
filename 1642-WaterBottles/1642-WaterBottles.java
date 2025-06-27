// Last updated: 6/27/2025, 11:41:47 AM
class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        return numBottles + shop(numBottles, numExchange);
    }

    static int shop(int b, int req){
        if(b < req)  return 0;
        return b/req + shop(b/req + b%req, req);
    }
}