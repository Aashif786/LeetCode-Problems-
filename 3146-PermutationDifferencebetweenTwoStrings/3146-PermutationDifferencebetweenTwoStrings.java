class Solution {
    public int findPermutationDifference(String s, String t)    {
        int x=0;
        for(int i=0;i<s.length();i++){
            x+=Math.abs(i-t.indexOf(s.charAt(i)));
        }
        return x;
    }
}