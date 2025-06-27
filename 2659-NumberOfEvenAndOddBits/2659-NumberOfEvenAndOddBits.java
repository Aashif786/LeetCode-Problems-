// Last updated: 6/27/2025, 11:41:02 AM
class Solution {
    public int[] evenOddBit(int n) {
        int even = 0, odd = 0;
        char c[] = Integer.toBinaryString(n).toCharArray();
        int len = c.length;
        for(int i = 0; i < len; i++){
            if(c[len - 1 - i] == '1'){
                even += (i % 2 == 0)? 1 : 0;
                odd  += (i % 2 == 1)? 1 : 0;
            }
        }
        return new int[] {even, odd};
    }
}