// Last updated: 6/27/2025, 11:44:58 AM
class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length() == 0) return 0;
        HashSet<Character> set = new HashSet<>();
        int j = 0, max = 0;
        for(int i = 0; i < s.length(); i++){
            while(set.contains(s.charAt(i))){
                set.remove(s.charAt(j));
                j++;
            }
            set.add(s.charAt(i));
            max = Math.max(max, i - j + 1);
        }
        return max;
    }
}