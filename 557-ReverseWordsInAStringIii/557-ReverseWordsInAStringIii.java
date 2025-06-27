// Last updated: 6/27/2025, 11:42:55 AM
class Solution {
    public String reverseWords(String s) {
        String [] ss = s.split(" ");
        for(int i = 0; i < ss.length; i++){
            StringBuilder sb = new StringBuilder(ss[i]);
            ss[i] = sb.reverse().toString();
        }
        return String.join(" ", ss);
    }
}