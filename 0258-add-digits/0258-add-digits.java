class Solution {
    public int addDigits(int num) 
    {
        if(num==0) return 0;        
        return add(num);
    }
    private int add(int n)
    {
        int sum=0;
        while(n>0)
        {
            sum+=n%10;
            n/=10;
        }   
        if(sum>9) return add(sum);
        else return sum;
    }
}