class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> s = new Stack<>();
        int sum = 0;
        int n = tokens.length;
        for(String c : tokens){
            if ( c.equals("+") || c.equals("-") || c.equals("*") || c.equals("/") ) {
                int b = s.pop() , a = s.pop();
                s.push(eval(a,b,c));
            }
            else s.push(Integer.parseInt(c));
        }
        return s.pop();
    }
    public int eval(int a , int b , String c){
        switch(c){
            case "+": return a+b;
            case "-": return a-b;
            case "*": return a*b;
            case "/": return a/b;            
        }
        return 0;
    }
}