// Last updated: 6/27/2025, 11:42:01 AM
class Solution {
    public int numberOfSteps(int num) {
        return steps(num);
    }
    private int steps(int x){
        if(x == 0) return 0;
        if(x%2 == 0) return 1 + steps(x/2);
        return 1 + steps(x-1);
    }
}