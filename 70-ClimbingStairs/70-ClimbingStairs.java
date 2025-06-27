// Last updated: 6/27/2025, 11:44:21 AM
class Solution {
    public int climbStairs(int n) 
    {
        if (n == 0 || n == 1) return 1;
        
        int prev = 1, curr = 1;
        for (int i = 2; i <= n; i++) 
        {
            int temp = curr;
            curr = prev + curr;
            prev = temp;
        }
        return curr;    
    }
}