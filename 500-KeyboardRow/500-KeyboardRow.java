// Last updated: 6/27/2025, 11:43:00 AM
class Solution {

    static boolean row(String r, String s){
        for(char c: s.toCharArray()){
            if(r.indexOf(Character.toLowerCase(c)) == -1 ) return false;
        }
        return true;
    }
    public String[] findWords(String[] ar) {
        ArrayList<String> a = new ArrayList<>();
        for(String w : ar){
            if(row("qwertyuiop", w) || row("asdfghjkl", w) || row("zxcvbnm", w)) a.add(w);
        }
        return a.toArray(new String[0]);
    }
}