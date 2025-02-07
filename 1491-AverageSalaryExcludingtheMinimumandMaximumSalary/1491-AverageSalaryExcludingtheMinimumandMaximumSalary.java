class Solution {
    public double average(int[] salary) {
        int max = Integer.MIN_VALUE , min = Integer.MAX_VALUE , sum = 0;
        for(int i : salary ){
            if (i>max) max = i;
            if (i<min) min = i;
            sum+=i;
        }
        return (double)(sum-max-min)/(salary.length-2) ;
    }
}