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