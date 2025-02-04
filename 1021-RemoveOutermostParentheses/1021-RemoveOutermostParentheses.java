class Solution {
    public String removeOuterParentheses(String s) {
        String str = "";
        int count = 0;
        for (char ch : s.toCharArray()) {
            if (ch == '(') {
                if (count > 0) str+="(";
                count++;
            } else {
                count--;
                if (count > 0) str+=")";
            }
        }
        System.gc();
        return str;
    }
}