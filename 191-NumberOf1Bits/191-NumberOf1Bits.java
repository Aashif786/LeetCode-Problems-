// Last updated: 6/27/2025, 11:43:40 AM
class Solution {
    public int hammingWeight(int n) {
        int w=0;
        while(n>0){
            if(n%2==1) w+=1;
            n/=2;
        }
        return w;

        // String b= Integer.toString(n,2);
        // int w=0;
        // for(char ch : b.toCharArray()){
        //     if(ch=='1') w+=1;
        // }
        // return w;
    }
}