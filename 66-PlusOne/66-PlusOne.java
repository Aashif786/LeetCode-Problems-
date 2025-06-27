// Last updated: 6/27/2025, 11:44:26 AM
class Solution 
{
    public int[] plusOne(int[] digits) 
    {
        for (int i=digits.length-1;i>=0;i--)
        {
            if(digits[i]<9)
            {
                digits[i]++;
                return digits;
            }
            digits[i]=0;
        }
        int[]aa = new int[digits.length+1];        
        aa[0]=1;
        return aa;

    }
}