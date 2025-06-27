// Last updated: 6/27/2025, 11:41:23 AM
class Solution {
    public String reversePrefix(String word, char ch) {
        int n=word.indexOf(ch);
        if(n==-1) return word;
        String rev = new StringBuilder(word.substring(0,n+1)).reverse().toString();
        return rev + word.substring(n+1);
    }
}