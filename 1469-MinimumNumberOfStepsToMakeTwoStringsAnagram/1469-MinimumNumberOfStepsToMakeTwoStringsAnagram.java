// Last updated: 7/28/2025, 3:26:11 PM
class Solution {
    public int minSteps(String s, String t) {
        // if(s.length() != t.length()) return false;
        int a[] = new int[26];
        int b[] = new int[26];
        int res = 0;
        for(char c : s.toCharArray()) a[c-97]++;
        for(char c : t.toCharArray()) b[c-97]++;
        for(int i = 0; i < 26; i++) res += Math.abs(a[i] - b[i]);
        return res / 2;
    }
}