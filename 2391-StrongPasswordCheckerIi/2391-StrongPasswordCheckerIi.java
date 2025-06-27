// Last updated: 6/27/2025, 11:41:14 AM
class Solution {
    public boolean strongPasswordCheckerII(String password) {
        if(password.length() < 8) return false;
        String sp = "!@#$%^&*()-+";
        boolean lc = false, uc = false, dg = false, sc = false;
        int n = password.length();
        for(int i = 0 ; i < n; i++){
            if(i!= n-1){
                if(password.charAt(i) == password.charAt(i+1)) return false;
            }
            char ch = password.charAt(i);
            if(ch >= 'a' && ch <= 'z') lc = true;
            if(ch >= 'A' && ch <= 'Z') uc = true;
            if(ch >= '0' && ch <= '9') dg = true;
            else if(sp.indexOf(ch) != -1) sc = true;
        }
        return lc && uc && dg && sc;
    }
}