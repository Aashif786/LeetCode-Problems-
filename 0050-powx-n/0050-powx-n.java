class Solution { 
    public double myPow(double x, int n) {
        if (x == 1) return 1;
        if (x== -1) return (n % 2 == 0) ? 1 : -1; 
        if (n == 0) return 1;
        long N = n; 
        if (N < 0) {
            x = 1 / x;
            N = -N; 
        }
        
        return powHelper(x,N);
    }

    private double powHelper(double x,long n) {
        if (n==0) return 1;
        
        double half=powHelper(x,n/2);
        
        if (n%2==0) {
            return half*half;
        } else {
            return half*half*x;
        }
    }
}
