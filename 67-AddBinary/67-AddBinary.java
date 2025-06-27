// Last updated: 6/27/2025, 11:44:25 AM
import java.math.BigInteger;
class Solution {
    public String addBinary(String a, String b) 
    {
        BigInteger aa= new BigInteger(a,2);
        BigInteger bb= new BigInteger(b,2);
        BigInteger sum= aa.add(bb);
        return sum.toString(2);
    }
}