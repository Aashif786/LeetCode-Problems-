// Last updated: 6/27/2025, 11:43:07 AM
class Solution {
    public void reverseString(char[] s) {
        int n=s.length;
        int i=0,j=n-1;
        
        while(i<j){
            char temp=s[i];
            s[i]=s[j];
            s[j]=temp;
            i++;j--;
        }
        return;
    }
}

