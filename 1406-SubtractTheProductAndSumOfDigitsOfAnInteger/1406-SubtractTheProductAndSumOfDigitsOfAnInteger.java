// Last updated: 6/27/2025, 11:42:04 AM
class Solution {
    public int subtractProductAndSum(int x) {
        int sum=0,product =1;
        while(x>0){
            int r=x%10;
            sum+=r;product*=r;
            x/=10;
        }
        return product-sum;
    }
}