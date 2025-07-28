// Last updated: 7/28/2025, 3:27:58 PM
class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        int a[] = new int[26];
        int b[] = new int[26];
        for(char c : s.toCharArray()) a[c-97]++;
        for(char c : t.toCharArray()) b[c-97]++;
        for(int i = 0; i < 26; i++) if(a[i] != b[i]) return false;
        return true;
    }
}