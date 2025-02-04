class Solution {
    public int maxDepth(String s) {
        Stack <Character> st  = new Stack<>();
        int n =0,x=0;
        s=s.replaceAll("[^()]","");
        System.out.println(s);
        for(char c : s.toCharArray()){
            if(c == '(') {
                st.push(c);
                n++;
                x=Math.max(x,n);
            }
            else {
                st.pop();
                n--;
            }
        }
        return x;
    }
}