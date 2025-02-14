class Solution {
    public String[] findRelativeRanks(int[] score) {
        int n = score.length;
        String [] res = new String[n];
        PriorityQueue <Integer> pq = new PriorityQueue<>((a , b) -> score[b] - score[a]);
        for(int i = 0 ; i < n ; i++) pq.add(i);
        int i = 1;
        while(!pq.isEmpty()){
            int x = pq.poll();
            if(i>3) res[x] = Integer.toString(i);
            else if(i == 1) res[x] = "Gold Medal";
            else if(i == 2) res[x] = "Silver Medal";
            else if(i == 3) res[x] = "Bronze Medal";
            i++;
        }
        return res;
    }
}