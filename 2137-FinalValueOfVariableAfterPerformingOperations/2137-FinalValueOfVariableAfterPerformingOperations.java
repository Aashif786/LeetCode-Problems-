// Last updated: 6/27/2025, 11:41:22 AM
class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int sum =0;
        for(String i : operations){
           if(i.charAt(1)=='+') sum+=1;
           else sum-=1;
        }
        return sum;
    }
}