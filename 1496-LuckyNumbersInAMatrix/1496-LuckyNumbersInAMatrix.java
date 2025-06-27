// Last updated: 6/27/2025, 11:41:59 AM
class Solution {
    public List<Integer> luckyNumbers(int[][] m) {
        List<Integer> l = new ArrayList<>();
        for(int i=0;i<m.length;i++){
            int lucky=m[i][0];
            boolean x = true;int mi =0;
            for(int j =0;j<m[0].length;j++) if(m[i][j]<lucky) { lucky = m[i][j]; mi = j; }
            for(int k=0;k<m.length;k++) {
                if(m[k][mi] > lucky) {
                    x=false;
                    break;
                }
            }
            if(x) l.add(lucky);
        }
        return l;
    }
}