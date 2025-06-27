// Last updated: 6/27/2025, 11:40:36 AM
class Solution {
    public int maxBottlesDrunk(int numBottles, int numExchange) {
        return shop(numBottles, numExchange);
    }
    static int shop(int b , int req){
        int a = b;
        int i = 0;

        while(b >= req){
            b -= req;
            req++;
            i++;
            a++;
            if(b < req) {
                b += i;
                i = 0;
            }
        }
        return a;
    }
}