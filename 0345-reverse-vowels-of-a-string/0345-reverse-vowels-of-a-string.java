class Solution {
    public String reverseVowels(String s) {
        int n=s.length();
        int i=0,j=n-1;
        String vowels = "aeiouAEIOU";
        char[]ss=s.toCharArray();
        while(i<j )
        {
            while(i<j && vowels.indexOf(ss[i])==-1) i++;
            while(i<j && vowels.indexOf(ss[j])==-1) j--;
            char temp=ss[i];
            ss[i]=ss[j];
            ss[j]=temp;
            i++;j--;
        }
        return new String(ss);
    }
}

// 