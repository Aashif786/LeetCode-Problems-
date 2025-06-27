// Last updated: 6/27/2025, 11:44:02 AM
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<Integer> getRow(int n) {
        List<List<Integer>> full = new ArrayList<>();
        
        for (int i = 1; i <= n+1; i++) {
            Integer[] in = new Integer[i];
            
            if (i == 1) {
                in[0] = 1;
            } else if (i == 2) {
                in[0] = 1;
                in[1] = 1;
            } else {
                in[0] = 1;
                in[i - 1] = 1;
                for (int j = 1; j < i - 1; j++) {
                    in[j] = full.get(i - 2).get(j - 1) + full.get(i - 2).get(j);
                }
            }
            
            full.add(Arrays.asList(in));  
        }
        
        return full.get(n);
    }
}