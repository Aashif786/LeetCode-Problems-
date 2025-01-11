class Solution {
    public int[] minOperations(String boxes) {
        int  n = boxes.length();
        int res[]= new int[n];
        for(int i=0; i<n;i++){
            int sum=0;
            if(boxes.charAt(i)=='1')    
            {
                for(int j=0; j<n;j++){
                    res[j]+=Math.abs(j-i);
                }
            }
        }
        return res;
    }
}