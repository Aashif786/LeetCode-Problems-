// Last updated: 7/28/2025, 3:29:17 PM
class Solution {
    static String common(String s, String res){
        int n = Math.min(s.length(), res.length()) ; 
        int x = -1, i;
        for(i = 0; i < n; i++)
        if(s.charAt(i) != res.charAt(i)) break;
        return res.substring(0,i);
    }
    public String longestCommonPrefix(String[] strs) {
        if(strs.length == 0) return "";
        String res = strs[0];
        for(int i = 1; i < strs.length; i++){
            res = common(strs[i], res);
            if(res.equals(""))break;
        }
        return res;
    }
}