// Last updated: 8/6/2025, 10:00:57 AM
class Solution {
    static 
    public String shortestPalindrome(String s) {
        String s2 = new StringBuilder(s).reverse().toString();
        int n = s.length();
        for(int i = 0; i < n; i++){
            if(s.startsWith(s2.substring(i))) return s2.substring(0, i) + s;
        }
        return s2 + s;
    }
}