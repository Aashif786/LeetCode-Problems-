// Last updated: 6/27/2025, 11:44:39 AM
class Solution {
    public int strStr(String a, String b) {
        if(b.length() > a.length()) return -1;
        if(b.equals(a)) return 0;
        int j =0;
        for(int i = 0; i <= a.length()-b.length() ; i++){
            if(b.equals(a.substring(i,i+b.length()))) {
                return i;
            }
        }
        return -1;
    }
}