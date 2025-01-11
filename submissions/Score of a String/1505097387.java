# Title: Score of a String
# Submission ID: 1505097387
# Status: Accepted
# Date: January 11, 2025 at 07:13:01 PM GMT+5:30

class Solution {
    public int scoreOfString(String s) {
        int score=0;
        for (int i = 0; i < s.length()-1; i++) {
            if( i+1 < s.length() ){
                score+= Math.abs((int)s.charAt(i)-(int)s.charAt(i+1));
            }
        }
        return score;
    }
}