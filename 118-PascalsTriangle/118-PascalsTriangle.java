// Last updated: 6/27/2025, 11:44:04 AM
import java.util.Arrays;
class Solution {
    public List<List<Integer>> generate(int n) {
        List<List<Integer>> full = new ArrayList<>();
        for (int i=1;i<=n;i++){
            Integer[]in = new Integer[i];
            if(i==1) in[0]=1;
            else if(i==2){in[0]=1;in[1]=1;}
            else{
                in[0]=1;in[i-1]=1;
                for (int j = 1; j < i - 1; j++) {
                    in[j] = full.get(i-2).get(j-1)+full.get(i-2).get(j);
                }
            }
            List al = Arrays.asList(in);
            full.add(al);
        }
        return full;
    }
}