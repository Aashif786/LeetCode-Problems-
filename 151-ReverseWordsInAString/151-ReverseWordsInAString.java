// Last updated: 6/27/2025, 11:43:52 AM
class Solution {
    public String reverseWords(String s) {
        int n = s.length()-1;
        while(s.charAt(n) == ' ') n--;
        StringBuilder sb = new StringBuilder("");
        int i = n;
        while(i>=0){
            while(i>=0 && s.charAt(i) != ' ') i--;
            sb.append(s.substring(i+1,n+1));
            sb.append(" ");
            while(i>=0 && s.charAt(i) == ' ') i--;
            n = i; 
        }
        return sb.toString().trim();
    }
}
        // for(int i = n ; i >= 0 ; i--) {
        //     if(s.charAt(i) != ' ') sb.append(s.charAt(i));
        //     else if(i>0 && (s.charAt(i) == ' ' && s.charAt(i-1) !=' ')) sb.append(" ");
        // }