// Last updated: 6/27/2025, 11:42:17 AM
class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder str = new StringBuilder();
        int count = 0;
        for (char ch : s.toCharArray()) {
            if (ch == '(') {
                if (count > 0) str.append("(");
                count++;
            } else {
                count--;
                if (count > 0) str.append(")");
            }
        }
        return str.toString();
    }
}