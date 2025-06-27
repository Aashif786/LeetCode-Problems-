// Last updated: 6/27/2025, 11:41:31 AM
class Solution {
    public boolean checkIfPangram(String str) {
        char[] a = new char[26];
        int ix = 0;
        for(char i = 'a' ; i<='z' ;i++) a[ix++] = i;
        ix = 0;
        for(char c : a) if(!str.contains(String.valueOf(c))) return false;
        return true;
    }
}