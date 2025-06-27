// Last updated: 6/27/2025, 11:42:18 AM
class Solution {
    public int bitwiseComplement(int n) {
        StringBuilder sb = new StringBuilder("");
        for(char ch : Integer.toBinaryString(n).toCharArray()){
            if(ch == '1') sb.append("0");
            else sb.append("1");
        }
        // System.out.println(sb.toString());
        return Integer.parseInt(sb.toString(),2);
    }
}